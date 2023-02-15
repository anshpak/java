package main;

public class Main {
    public static void main(String[] args) {
        String str = "1 2 3";
        String res = "";
        String[] numbers = str.split(" ");
        for (String num : numbers) {
            if(Integer.parseInt(num) % 3 == 0 || Integer.parseInt(num) % 9 == 0){
                res += num;
            }
        }
        System.out.println(res);
    }
}