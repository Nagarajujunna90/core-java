package com.example.demo;

import lombok.Synchronized;

public class Singleton {
    //1st approach
    // private static Singleton singleton = new Singleton();
    private static Singleton singleton = null;//new Singleton();

    //2nd approach
   /* static {
        singleton = new Singleton();
    }
*/
    private Singleton() {

    }

    public static  Singleton getSingleton() {
        if (singleton == null) {
        //    synchronized (Singleton.class) {
                System.out.println("inside");
                singleton = new Singleton();
           // }
        }
        return singleton;
    }
}
