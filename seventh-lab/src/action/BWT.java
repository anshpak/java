package action;

import java.util.Arrays;

public class BWT {
    public static String decode(String L) {
        String res = "";
        String F = BWT.sortString(L);
        int index = L.length() - 1;
        int count = L.length();
        char ch;
        while(count != 0) {
            ch = F.charAt(index);
            res += ch;
            index = BWT.getNextIndex(index, ch, L, F);
            count--;
        }

        return res;
    }

    private static int getNextIndex(int curInd, char ch, String L, String F) {
        int count = 0;
        for(int i = 0; i < curInd; i++) {
            if(F.charAt(i) == ch) {
                count++;
            }
        }
        int j = 0;
        while(true) {
            if(L.charAt(j) == ch) {
                count--;
                if (count < 0) {
                    break;
                }
            }
            j++;
        }
        return j;
    }

    private static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
