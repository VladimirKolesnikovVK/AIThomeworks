package de.ait.homework52;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAirport {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileAirport.class);

    private static final String AIRPORTS_FILE = "airports.txt";

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(AIRPORTS_FILE))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] parts = line.split(" ");
                String airportName = parts[0];
                String iataCode = parts[1];
                StringBuilder countryBuilder = new StringBuilder();
                for (int i = 2; i<parts.length; i++){
                    countryBuilder.append(parts[i]);
                    if (i<parts.length -1){
                        countryBuilder.append(" ");
                    }
                }
                String country = countryBuilder.toString();

                LOGGER.info("Аэропорт: {}, Код IATA: {}, Страна: {}",airportName,iataCode,country);
            }
        }
        catch (IOException exception){
            LOGGER.error("введенны не правельные данные",exception);
        }
    }
}
