package com.etaTech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StaticTest test = new StaticTest("Fady");
        System.out.println("Test Str = "+test.getStr()+" Num = "+test.getNum());

        StaticTest test2 = new StaticTest("Fouad");
        System.out.println("Test Str = "+test.getStr()+" Num = "+test.getNum());

        StaticTest test3 = new StaticTest("Fouad");
        int i = StaticTest.getNumStatic(); // You dont need instance of class to call static methods
        System.out.println("Test Str = "+test.getStr()+" Num = "+i);


        FinalTest finalTest = new FinalTest("One");
        FinalTest finalTest2 = new FinalTest("two");
        FinalTest finalTest3 = new FinalTest("three");

//        Math math = new Math(); // Cannot instantiate this class. Or extend constructor is private
        int myPass = 123456 ;
        Password password = new Password(myPass);
        password.storePass();
        password.logIn(123456);
        password.logIn(23456);
    }
}
