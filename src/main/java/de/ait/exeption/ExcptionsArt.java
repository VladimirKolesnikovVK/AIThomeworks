package de.ait.exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcptionsArt {
    public static void main(String[] args) {
        readInput();
    }

    public static void readInput(){
        int [] number = {1,3,5};
        try {
            System.out.println(number[10]);
        }
        catch (ArrayIndexOutOfBoundsException exception){

        }
    }

   /* public static void readInput(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("info.txt");
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }

    }*/
}
