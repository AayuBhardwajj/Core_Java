package com.telusko;


public class Calculator implements Operations {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public double div(int a, int b){
        if(b!=0){
            return a/b;
        }
        else{
           throw new ArithmeticException("Can't be divisble by zero");
        }
    }
}
