package de.ait.javaio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOStream.class);
    private static final String PATH = "C:\\Users\\Laptop\\Desktop\\aithomeworks\\src\\main\\resources\\password.txt";

    public static void main(String[] args) {
        try {
             InputStream inputStream = new FileInputStream(PATH);
             inputStream.close();
        }
        catch (FileNotFoundException exception){
            LOGGER.error("fail {} ne naiden {}",PATH, exception.getMessage());
        }
         catch (IOException exception) {
            LOGGER.error("oshibka pri zakritii potoka:{}", exception.getMessage());
        }
        catch (Exception exception){
            LOGGER.error("innaja oshibka pri rabote s potokom:{}",exception.getMessage());
        }

    }
}
