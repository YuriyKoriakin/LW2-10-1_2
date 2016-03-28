package com.brainacad.oop.testexcp1;

/**
 * Created by Yuriy on 04.03.2016.
 */
public class MyException extends Exception {//створюємо клас майексепшн, який наслідується від класу ексепшн
    private String message;

    public MyException(String message) {//створюємо конструктор для зберігання повідомлення
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void printMessage() {
        System.out.println(getMessage());
    }
}


