package com.hello;

public class HelloMain {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld("Md","Rahman",1982);
        System.out.println(helloWorld.firstName);
        System.out.println(helloWorld.lastName);
        System.out.println(helloWorld.dateOfBirth);
    }
}
