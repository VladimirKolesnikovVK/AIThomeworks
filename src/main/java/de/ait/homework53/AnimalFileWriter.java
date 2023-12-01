package de.ait.homework53;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AnimalFileWriter {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalFileWriter.class);

    public void saveAnimalsToFile(List<Animal> animalsToSave, String file) {
        try (FileWriter fileWriter = new FileWriter(file)){
            for(Animal animal:animalsToSave) {
            fileWriter.write(animal.toString() + "\n");
        }
        }catch (IOException exception){
            LOGGER.error("oshibka pri zapisi dannih {} ",exception.getMessage());
        }
    }

}
