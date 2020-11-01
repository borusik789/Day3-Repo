package Practice;

public class Example{
    public static void main(String args[]){
        //creating a string by java string literal
        String str = "Beginnersbook";
        char arrch[]={'h','e','l','l','o'};
        //converting char array arrch[] to string str2
        String str2 = "Beginnersbook";

        //creating another java string str3 by using new keyword
        String str3 = new String("Beginnersbook");

        //Displaying all the three strings
        System.out.println(str==str2);
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str));
    }
}