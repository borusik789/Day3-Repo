import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i-- ){
            rev+=str.charAt(i);

        }
        System.out.println(rev);
        System.out.println("The word is a palindrome: "+rev.equals(str));

    }


}
