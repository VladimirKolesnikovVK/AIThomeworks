package de.ait.homework50;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaReadFile {
    public static void main(String[] args) throws IOException{
        File file = new File("");

        //sozdaem i inizializiruem FileReader dla chtenia coderzhimogo faila
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int counter = 0;
        String wordToCount = "sku";
        String lineInDocument = bufferedReader.readLine();

        if (lineInDocument != null && lineInDocument.contains(wordToCount)){
            counter++;
        }

        while (lineInDocument != null){
            System.out.println(lineInDocument);

            lineInDocument = bufferedReader.readLine();
            if (lineInDocument != null && lineInDocument.contains(wordToCount)){
                counter++;
            }
        }
        System.out.println("counter -->" + counter);
    }
}
