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

        } else if (numMultipliers.size() > denomMultipliers.size()) {
            reduceFraction(numMultipliers, denomMultipliers, fraction);
        } else {
            reduceFraction(denomMultipliers, numMultipliers, fraction);
        }
    }

    private void reduceFraction(ArrayList<Integer> l1, ArrayList<Integer> l2, Fraction fraction) {
        for (int i = 0; i < l1.size(); i++) {
            if(l2.contains(l1.get(i))) {
                fraction.setNumerator(fraction.getNumerator() / l1.get(i));
                fraction.setDenominator(fraction.getDenominator() / l1.get(i));
                l2.set(i, -1);
            }
        }
    }
}
