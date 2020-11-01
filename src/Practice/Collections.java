package Practice;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        String str1 = "asdasddsasasd";
        String str2 = "dsa";

        str1 =   new TreeSet<>(Arrays.asList( str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));


        String[] names = {"Oleg","Igor","Oleg","Boris","Oleg"};
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(names));

        names = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(names));


        Integer [] num = {3,4,5,8,9,6,3,4,5,6};
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(num));
        num = set2.toArray(new Integer[0]);
//        num = new TreeSet<>(Arrays.asList(num)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(num));






    }


}
