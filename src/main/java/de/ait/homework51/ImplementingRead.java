package de.ait.homework51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImplementingRead {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImplementingRead.class);

    public static void main(String[] args) throws IOException {
        File filesource = new File("source.txt");
        File filedestination = new File("destination.txt");

        FileReader fileReader = new FileReader(filesource);



    }
    private static void createSourceFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("source.txt"))) {
            LOGGER.info(" fail sozdan {}", writer);
            writer.write("Kto tut");
        } catch (IOException exception) {
            LOGGER.error("oshibka pri sozdania faila {}", exception);
        }
    }
    private static String invertWord(String word){
        StringBuilder invertedWord = new StringBuilder();
        for (int i = word.length()-1; i >=0; i--){
            invertedWord.append(word.charAt(i));
            LOGGER.info("Инвертирование каждого символа в слове {}",invertedWord);
        }
        return invertedWord.toString();
    }
    private static void processAndWriteToFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"))) {

            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split("\\s");
                for (String word : words) {
                    String invertedWord = invertWord(word);
                    writer.write(invertedWord + " ");
                }
                writer.newLine();
                line = reader.readLine();
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.err.println("Файл source.txt не найден.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при чтении/записи файла.");
        }
    }
}
