package Action;
import Numbers.Numbers;

public class NumbersProcessing {
    public Numbers getDividedIntoThree(Numbers nums){
        Numbers res = new Numbers();
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
