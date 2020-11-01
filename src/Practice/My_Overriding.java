package Practice;

class MyClass {
    static void myStaticMethod() {
        System.out.println("Im in sta1");
    }
}

class MySubClass extends MyClass {

    static void  myStaticMethod() {
        System.out.println("Im in sta123");
    }
}

public class My_Overriding {
    public static void main(String arg[]) {
        System.out.println("1     #################");
        MyClass myObject = new MyClass();
        myObject.myStaticMethod();
        System.out.println("2     #################");
        // should be written as
        MyClass.myStaticMethod();
        System.out.println("3     #################");

        // calling from subclass name
        MySubClass.myStaticMethod();
        System.out.println("4     #################");

        myObject = new MySubClass();
        myObject.myStaticMethod();


        // still calls the static method in MyClass, NOT in MySubClass
    }
}