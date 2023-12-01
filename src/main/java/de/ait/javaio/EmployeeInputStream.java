package de.ait.javaio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeInputStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeInputStream.class);
    private static String path = "employees.txt";

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){


            Employee employee = (Employee) objectInputStream.readObject();

            LOGGER.info("obiekt uspeshno sozdan, ID: {}",employee.getId());

        } catch (FileNotFoundException exception) {
            LOGGER.error("fail {} ne naiden ili ne sozdan {}",path,exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error("oshibka v rabote dannih. fail {},{}",path,exception.getMessage());
        } catch (ClassNotFoundException exception) {
            LOGGER.error("oshibka v poiske klassa dla deserializazii. {}",exception.getMessage());
        }
    }
}
