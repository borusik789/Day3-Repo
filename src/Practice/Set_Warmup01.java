package Practice;

import java.util.*;

public class Set_Warmup01 {

    public static void main(String[] args) {
        /*1. write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions
*/

        String[] words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch20"};
        ArrayList<String> w = new ArrayList<>(Arrays.asList(words));
        System.out.println(w);

        Iterator<String> it = w.iterator();

        while (it.hasNext()){
            String each = it.next();
            String rev = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                rev+=each.charAt(i);

            }
            if (rev.equalsIgnoreCase(each)){
                it.remove();
            }

        }
        System.out.println(w);


        /*2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions
            */
        Integer[] num ={111,113,100, 900, 90, 80, 76, 120, 55, 22, 23, 45, 65, 6, 9,9,9,9,9,9,9,9,9};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(num));

        System.out.println(set);

        Iterator<Integer> it1 = set.iterator();

        while (it1.hasNext()){
            Integer each = it1.next();
            if (each%2==0){
                it1.remove();
            }
        }
        System.out.println(set);




        /*3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order
            */

List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

Set<Integer> set1 = new TreeSet<>(list);

list.clear();
list.addAll(set1);
        System.out.println(set1);



        List<String> l = new ArrayList<>(Arrays.asList("Hi","Hello","Hi","Hello","Hello"));

        String[] s = l.toArray(new String[0]);

        String a =l.toString();
        a=a.replace("[","").replace("]","").replace(",","");
        System.out.println(a);
        Iterator<String> iter = l.iterator();

        while (iter.hasNext()){
            if(iter.next().equalsIgnoreCase("hi")){
                iter.remove();
            }

        }
        a =l.toString();
        a=a.replace("[","").replace("]","").replace(",","");
        System.out.println(a);
        System.out.println(Arrays.toString(s));
        System.out.println(l);


    }
}
