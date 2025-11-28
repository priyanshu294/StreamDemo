package org.codesnippet.interviewquestions.random;

//Write a Thread-Safe Singleton
public class Singleton {

    private Singleton() {} // private constructor

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
