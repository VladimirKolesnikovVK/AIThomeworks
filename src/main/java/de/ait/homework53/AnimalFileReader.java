package de.ait.homework53;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnimalFileReader {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalFileReader.class);

    public void readAnimalsFromFile(String file){
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String animalLine;
            while ((animalLine =bufferedReader.readLine()) != null){
                System.out.println(animalLine);
            }
        } catch (FileNotFoundException exception) {
            LOGGER.error("fail ne naiden {}",exception.getMessage());
        } catch (IOException exception) {
           LOGGER.error("oshibka schitivania faila {}",exception.getMessage());
        }
    }
}
