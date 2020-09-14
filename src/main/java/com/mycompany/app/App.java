package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
<<<<<<< HEAD
    private final String message2 = "Hello World2";
    private final String message3 = "Hello World3";
=======

>>>>>>> parent of 97e9a6a... commitTest2
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message + "testCommit";
    }

}
