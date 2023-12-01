package de.ait.javaio;

import java.io.IOException;

public class TestJavaReadWritePassFile {
    //put k interesuushemu nas failu
    private static final String PATH = "C:\\Users\\Laptop\\Desktop\\aithomeworks\\src\\main\\resources\\password.txt";

    //eksemplar obiekta
    private static JavaReadWritePassFile javaReadWritePassFile;

    public static void main(String[] args) {
        javaReadWritePassFile = new JavaReadWritePassFile(PATH);

        try {
            //chitaem fail cherez vizov metoda
            javaReadWritePassFile.readFile();
            javaReadWritePassFile.writeFile("cohort 33");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
