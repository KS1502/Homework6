package Homework;

public class Main {
    public static void main(String[] args){
        MyDate myDate = new MyDate(15,02,1990);
        MyDate myDate1 = new MyDate(15,03,2023);

        System.out.println(myDate==myDate1);

        Object object = new Object();

        System.out.println("equals via =="+(myDate==myDate1));
        System.out.println();
        System.out.println("equals via overrided equals "+myDate.equals(myDate1));

       /*false

        equals via ==false

        equals via overrided equals false */
    }
}
