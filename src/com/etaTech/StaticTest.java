package com.etaTech;

/****************************************************
 *** Created by Fady Fouad on 03/05/2019 at 00:56.***
 ***************************************************/
public class StaticTest {
    private static int num = 0;
    private String str;

    public StaticTest(String str) {
        this.str = str;
        num++;
    }

    public int getNum() {
        return num;
    }

    public static int getNumStatic() {
        return num;
    }

    public String getStr() {
        return str;
    }
}