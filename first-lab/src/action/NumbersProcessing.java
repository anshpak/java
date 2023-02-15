package action;
import numbers.IntegerNumbers;

public class NumbersProcessing {
    public IntegerNumbers getDividedIntoThree(IntegerNumbers nums){
        IntegerNumbers res = new IntegerNumbers();
        String strRes = new String("");
        String[] numbers = nums.getNumericalSequence().split(" ");
        for (String num : numbers) {
            if(Integer.parseInt(num) % 3 == 0 || Integer.parseInt(num) % 9 == 0){
                strRes += num;
            }
        }
        res.setNumericalSequence(strRes);
        return res;
    }
}
