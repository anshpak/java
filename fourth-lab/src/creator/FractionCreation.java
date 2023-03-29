package creator;

import entity.Fraction;
import java.util.ArrayList;

public class FractionCreation {
    public void reduceFractionCall(Fraction fraction) {
        ArrayList<Integer> numMultipliers = getMultipliers(fraction.getNumerator());
        ArrayList<Integer> denomMultipliers = getMultipliers(fraction.getDenominator());
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

    private ArrayList<Integer> getMultipliers(int number) {
        ArrayList<Integer> multipliers = new ArrayList<Integer>();
        while(number % 2 == 0) {
            multipliers.add(2);
            number = number / 2;
        }
        for(int i = 3; i * i <= number; i += 2) {
            if(number % i == 0) {
                multipliers.add(i);
                number = number / i;
                i = 3;
            }
        }
        multipliers.add(number);
        return multipliers;
    }
}
