package com.etaTech;

/****************************************************
 *** Created by Fady Fouad on 03/05/2019 at 17:57.***
 ***************************************************/
public final class Password {
    private static final int key = 564387568 ;
    private final int encryotedPass ;

    public Password(int encryotedPass) {
        this.encryotedPass = encryotDecrypt(encryotedPass);
    }

    private int encryotDecrypt(int pass) {

        return pass^key;
    }
    public final void storePass(){
        System.out.println("Saved password as -> "+encryotedPass);
    }
    public boolean logIn (int pass) {
        if (encryotDecrypt(pass) == encryotedPass) {
            System.out.println("Loged In Success");
            return true;
        } else {
            System.out.println("Faild");
            return false;
        }
    }
}