package de.ait.javaio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class JavaReadWritePassFile {
    private InputStream inputStream;
    private OutputStream outputStream;

    //put k interesuushemu failu
    private String path;

    public JavaReadWritePassFile(String path){
        this.path = path;
    }

    public void readFile() throws IOException {
        //inizializiruem chtenie potoka
        inputStream = new FileInputStream(path);

        //schitivaem pervii simvol
        int data = inputStream.read();

        char contet;

        //schitivaem soderzhimoe faila pobaitovo
        while (data!= -1){
            //bait -->simvol
            contet = (char) data;

            System.out.println(contet);

            data = inputStream.read();
        }
        inputStream.close();
    }
    //zapisivaem v fail
    public void writeFile(String stringToWrite) throws IOException{
        //inizializiruem potok na zapis
        outputStream = new FileOutputStream(path);

        //podgotavlivaem vnesenie zapisu v fail/potok
        outputStream.write(stringToWrite.getBytes());

        outputStream.close();
    }
}
