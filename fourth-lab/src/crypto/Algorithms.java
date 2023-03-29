package crypto;

import java.util.ArrayList;

public class Algorithms {
    public ArrayList<Integer> factorisation(int number) {
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
