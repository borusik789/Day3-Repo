package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddNum {
    public static void main(String[] args) {


        String str = "ert1ert2etr5ert34et1";
        String sum = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            char n = str.charAt(i);
            char n1 = str.charAt(i+1);

            if (n >= 48 && n <= 57) {


                sum+=""+(n);


            }
        }
        char[] arr =sum.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}