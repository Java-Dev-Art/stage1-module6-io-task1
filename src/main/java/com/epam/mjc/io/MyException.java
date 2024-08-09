package com.epam.mjc.io;

import java.io.IOException;

public class MyException extends Exception{
    public MyException(String message) {
        super("I have problem with " +message);
    }

    public MyException(IOException e) {
        super("I have problem with " + e);
    }
}
