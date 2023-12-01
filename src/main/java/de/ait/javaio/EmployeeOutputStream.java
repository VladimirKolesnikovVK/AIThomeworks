package de.ait.javaio;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeOutputStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOutputStream.class);
    private static String path = "employees.txt";
    public static void main(String[] args) {
        Employee employeeBatman = new Employee(67890,"batman", 2000);

        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)){

            outputStream.writeObject(employeeBatman);
            outputStream.flush();

            LOGGER.info("dannie sotrudnika uspeshno sozdani. id:{}",employeeBatman.getId());
        } catch (FileNotFoundException exception) {
            LOGGER.error("fail {} ne naiden ili ne sozdan {}",path,exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error("oshibka v rabote dannih. fail {},{}",path,exception.getMessage());
        }
    }
}
