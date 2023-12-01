package de.ait.homework51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ImplementingReadNew {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImplementingReadNew.class);

    private static final String SOURCE_FILE = "source.txt";
    private static final String DESTINATION_FILE = "destination.txt";
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(SOURCE_FILE);
            FileWriter writer = new FileWriter(DESTINATION_FILE)){

            writeReverseTextToFile(reader,writer);

        }catch (FileNotFoundException exception){
            LOGGER.error("fail ne naiden {}",exception.getMessage());

        }catch (IOException exception){
            LOGGER.error("oshibka v obrabotke failov {}",exception.getMessage());
        }

    }
    public static void writeReverseTextToFile(Reader reader, Writer writer) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line;

        while ((line = bufferedReader.readLine()) != null){
            String [] words = line.split("\\s+");
            for (int i=0; i < words.length; i++){
                String reversedWord = reverseString(words[i]);
                bufferedWriter.write(reversedWord);
                bufferedWriter.write("");
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        LOGGER.info("zapis uspeshno zavershena");
    }

    public static String reverseString(String wordToReverse){
        char [] lettersArray = new char[wordToReverse.length()];
        for (int i=0, j= wordToReverse.length()-1; i<j; i++, j--){
            lettersArray[i] = wordToReverse.charAt(j);
            lettersArray[j] = wordToReverse.charAt(i);
        }
        String wordToReturn = new String(lettersArray);
        LOGGER.info("slovo {} uspeshno obrabotano. result {} ",wordToReverse,wordToReturn);
        return wordToReturn;
    }
    public static String reverseStringSmall(String wordToReverse){
        String wordToReturn = new StringBuilder (wordToReverse).reverse().toString();
        LOGGER.info("");
        return new String(wordToReturn);
    }

}
