package com.etaTech;

/****************************************************
 *** Created by Fady Fouad on 03/05/2019 at 17:33.***
 ***************************************************/
public class FinalTest {

    public final int anInt;
    private static int counter = 0;
    private final String name ;
    public  FinalTest(String name){
        this.name = name ;
        counter ++ ;
        anInt = counter ;
        System.out.println("Final Int = "+anInt);
    }

    public int getAnInt() {
        return anInt;
    }

}