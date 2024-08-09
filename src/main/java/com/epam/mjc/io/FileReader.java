package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                if (values[0].equalsIgnoreCase("Name:")) {
                    profile.setName(values[1]);
                }
                if (values[0].equalsIgnoreCase("Age:")) {
                    profile.setAge(Integer.parseInt(values[1]));
                }
                if (values[0].equalsIgnoreCase("Email:")) {
                    profile.setEmail(values[1]);
                }
                if (values[0].equalsIgnoreCase("Phone:")) {
                    profile.setPhone(Long.parseLong(values[1]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return profile;
    }
}