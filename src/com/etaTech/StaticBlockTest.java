package com.etaTech;

/****************************************************
 *** Created by Fady Fouad on 03/05/2019 at 18:17.***
 ***************************************************/
public class StaticBlockTest {
    public static final String owner ;

    static {
        owner ="Fady";
        System.out.println("Static block Called");
    }

    public StaticBlockTest() {
        System.out.println("Constructor block Called");
    }
    public void myMethod(){
        System.out.println("myMethod block Called");

    }
    static{
        System.out.println("another Static block Called");
    }
}