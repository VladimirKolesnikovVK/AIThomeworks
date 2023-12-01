package de.ait.homework52;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAirportNew {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileAirportNew.class);

    private static String path = "airports.txt";

    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String []parts = line.split(";",3);
                if (parts.length==3){
                    String name = parts[0];
                    String iata = parts[1];
                    String contry = parts[2];

                    LOGGER.info("Аэропорт: {}, Код IATA: {}, Страна: {}.",name,iata,contry);
                }
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException exception){
            LOGGER.error("fail {} ne bil naiden {}",path,exception.getMessage());
        }
        catch (IOException exception){
            LOGGER.error("fail {} ne vozmozhno schitat {}",path,exception.getMessage());
        }
    }
}
