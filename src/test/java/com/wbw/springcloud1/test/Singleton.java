package com.wbw.springcloud1.test;


public class  Singleton{
    public static void main(String[] args) {
        Singleton1 singleton1=Singleton1.inttance;

        singleton1.whateverMethod();
    }

    enum Singleton1 {
        inttance;
        public void whateverMethod(){
            System.out.println("11111111");
        }
    }
}

