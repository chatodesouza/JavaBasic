package com.basic.exceptionandtimer;

import java.io.*;
import java.util.UnknownFormatConversionException;

/**
 * Created by cagdas.kose on 15.12.2016.
 */
public class ExceptionMechanism {

    public ExceptionMechanism() throws IOException {
    }

    public static void main(String[] args) {

        try {
            getMathResult();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file = new File("C:\\asd");
        try {
            InputStream is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("asdasd");
        }
        System.out.println("asdasd");
    }

    public String getUserName() {
        System.out.println("Veritabanından user bilgisi çekiliyor.");

        try {
            File file = new File("C:\\asd");
            InputStream is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            System.out.println("asdasd");
        }

        return null;
    }

    public static void getMathResult() throws IOException, FileNotFoundException {
        System.out.println("askdmaskdmasd");
        throw new FileNotFoundException();
    }
}
