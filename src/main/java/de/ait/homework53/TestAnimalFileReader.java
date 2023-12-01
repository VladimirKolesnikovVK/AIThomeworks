package de.ait.homework53;

import java.util.ArrayList;
import java.util.List;

public class TestAnimalFileReader {
    private static List<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
        Animal animalHatiko = new Animal("hatiko","dog",5);
        Animal animalLion = new Animal("simba","lion",10);
        animals.add(animalHatiko);
        animals.add(animalLion);

        AnimalFileWriter animalFileWriter = new AnimalFileWriter();
        animalFileWriter.saveAnimalsToFile(animals,"animalsHeros.txt");

        AnimalFileReader animalFileReader = new AnimalFileReader();
        animalFileReader.readAnimalsFromFile("animalsHeros.txt");
    }
}
