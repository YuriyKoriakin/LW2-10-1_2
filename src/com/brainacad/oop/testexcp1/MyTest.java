package com.brainacad.oop.testexcp1;

/**
 * Created by Yuriy on 04.03.2016.
 */
public class MyTest {
    public void test()throws MyException{//потрібно зазначити оскільки ми кидаємо ексепшн
        throw new MyException("some message");
    }
}
