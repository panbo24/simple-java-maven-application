package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    private final String message2 = "Hello World2";
    private final String message3 = "Hello World3";
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message + "testCommit";
    }

}
