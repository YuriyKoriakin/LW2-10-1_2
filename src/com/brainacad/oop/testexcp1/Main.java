package com.brainacad.oop.testexcp1;

/**
 * Created by Yuriy on 04.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        try {
            throw new Exception("Exeption 1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was there");
        }

        //Lab 2.10.2
        try {
            throw new MyException("Exception 2");
        } catch (MyException e) {
            e.printMessage();
        }
        MyTest myTest = new MyTest();
        try {
            myTest.test();
        } catch (MyException e) {
            e.printMessage();
        } finally {
            System.out.println("Here again");
        }
        MyTest myTestNull = null;
        try {
            myTest.test();
        } catch (MyException e) {
            e.printMessage();
        } finally {
            System.out.println("Here one more time");
        }
    }
}
