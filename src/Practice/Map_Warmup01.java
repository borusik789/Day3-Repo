package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Warmup01 {

    /*
    1. Write a program that stores the the character and frequency of each character from a
    String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}
 */

    public static void main(String[] args) {

        String str = "aaabbbccb";
        int count=0;
        String [] s = str.split("");
        Map<String, Integer> res = new LinkedHashMap<>();
        for (String each : s) {
            for (int i = 0; i < s.length; i++) {
                if (each.equals(s[i])){
                    count++;
                }

            }
            if (count>=1){
                res.put(each, count);
            }
            count=0;
        }
        System.out.println(res);

/*2. write a program that stores the unique characters from a string into map:

        Ex: "abacbdeef";
        output:
            {c=1, d=1, f=1}
            */
        String str1 = "abacbdeef";
        int count1=0;
        String [] s1 = str1.split("");
        Map<String, Integer> res1 = new LinkedHashMap<>();
        for (String each : s1) {

            for (String each1 : s1) {
                if (each.equals(each1)){
                    count1++;
                }

          }
                   if (count1==1){
                 res1.put(each, count1);
            }
            count1=0;
        }
        System.out.println(res1);


    }

    }







