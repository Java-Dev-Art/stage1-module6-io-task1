package com.epam.mjc.io;

import java.io.IOException;

public class MyException extends IOException{
    public MyException(String message) {
        super("I have problem with " +message);
    }

    public MyException(IOException e) {
        super("I have problem with " + e);
    }
}
