package main;
import numbers.IntegerNumbers;
import actions.NumbersProcessing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String strNums;
        strNums = JOptionPane.showInputDialog("Please, enter the sequence of Integer nums with only spaces between: ");
        IntegerNumbers nums = new IntegerNumbers();
        nums.setNumericalSequence(strNums);
        IntegerNumbers numsDividedIntoThreeNine;
        NumbersProcessing action = new NumbersProcessing();
        try{numsDividedIntoThreeNine = action.getDividedIntoThree(nums);
            JOptionPane.showMessageDialog(null, "The numbers which are divided into 3 or 9 are: \n" + numsDividedIntoThreeNine.getNumericalSequence() + ".");
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Bad Input was detected.");
        }
    }
}