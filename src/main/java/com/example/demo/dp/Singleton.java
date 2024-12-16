package com.example.demo.dp;

public class Singleton {
    //1st approach
    // private static Singleton singleton = new Singleton();
    private static Singleton singleton = null;//new Singleton();
    //The disadvantage: the instance is created irrespective of whether it is accessed or not.

    //2nd approach
   /* static {
        singleton = new Singleton();
        //Disadvantage:the instance is created whether or not it is needed by the application.
    }
*/
    private Singleton() {

    }
    //synchronized at method level-Disadvantage:This is needed to prevent race conditions in multi-threaded environments.
    public static  Singleton getSingleton() {
        if (singleton == null) {
            //Advantages:The above approach is called Double-Checked Locking because we double-check whether the variable is initialized or not inside the synchronized block.
        //    synchronized (Singleton.class) {
                System.out.println("inside");
                singleton = new Singleton();
           // }
        }
        return singleton;
    }
}
