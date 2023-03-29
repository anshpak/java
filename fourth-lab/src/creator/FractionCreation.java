package creator;

import entity.Fraction;
import java.util.ArrayList;
import crypto.Algorithms;

public class FractionCreation {
    public void reduceFractionCall(Fraction fraction) {
        Algorithms algorithm = new Algorithms();
        ArrayList<Integer> numMultipliers = algorithm.factorisation(fraction.getNumerator());
        ArrayList<Integer> denomMultipliers = algorithm.factorisation(fraction.getDenominator());
        if(numMultipliers.size() == denomMultipliers.size()) {
            reduceFraction(numMultipliers, denomMultipliers, fraction);
        } else if (numMultipliers.size() > denomMultipliers.size()) {
            reduceFraction(numMultipliers, denomMultipliers, fraction);
        } else {
            reduceFraction(denomMultipliers, numMultipliers, fraction);
        }
    }

    private void reduceFraction(ArrayList<Integer> l1, ArrayList<Integer> l2, Fraction fraction) {
        for (int i = 0; i < l2.size(); i++) {
            if(l1.contains(l2.get(i))) {
                fraction.setNumerator(fraction.getNumerator() / l2.get(i));
                fraction.setDenominator(fraction.getDenominator() / l2.get(i));
                l1.set(i, -1);
            }
        }
    }
}
