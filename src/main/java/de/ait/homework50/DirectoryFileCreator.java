package de.ait.homework50;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryFileCreator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryFileCreator.class);

    private static String createText = "zadaite put dla sozdavaemoi direktorii: ";
    private static String myDirectory = "myDirectory";
    public static void main(String[] args) {

        System.out.println(createText);
        Scanner scanner = new Scanner(System.in);

        String pathToCreate = scanner.nextLine();

        File directoryToCreate = new File(pathToCreate + File.separator + myDirectory);
        String path = pathToCreate + File.separator + myDirectory;
        File resultFile = null;
        if (directoryToCreate.exists()){
            LOGGER.warn("sozdanie direktorii {} nevozmozhno. ona  uzhe suchestvuet ", path);
            System.out.println("sozdanie direktorii " + path + " nevozmozhno. ona  uzhe suchestvuet");
        }else {
            boolean created = directoryToCreate.mkdir();
            if (created){
                LOGGER.info("direktoria {} uspeshno sozdana",path);
                System.out.println("sozdanie direktorii " + path + " uspeshno sozdana");
                resultFile = createFileInDirectory(path, "myFile.txt");
                if (resultFile != null){
                    System.out.println("" + path);
                }else {
                    System.out.println("" + path);
                }
            }else {
                LOGGER.warn("" + path);
                System.out.println("" + path + "");
            }
            if (resultFile != null){
                deleteFileAndDirectory(resultFile, directoryToCreate);
            }
        }
    }
    private static File createFileInDirectory(String directory, String fileName){
        File file = new File(directory + File.separator + fileName);
        try {
            boolean resultFileCreated = file.createNewFile();
            if (resultFileCreated){
                LOGGER.info("");
                return file;
            }else {
                LOGGER.warn("ne udalos sozdat fail {} v direktorii {}",fileName,directory);
                return null;
            }
        } catch (IOException exception) {
            LOGGER.error("iskluchenie pri sozdanii faila {} v direktorii {}", fileName,directory);
            return null;
        }
    }
    private static boolean deleteFileAndDirectory(File fileToDelete, File directoryToCreate){
        boolean deleteResult = fileToDelete.delete();
        if (deleteResult){
            LOGGER.info("fail {} bil uspeshno udalen v direktorii {}", fileToDelete.getName(),fileToDelete.getAbsolutePath());
            directoryToCreate.delete();
            LOGGER.info("",directoryToCreate);
            return true;
        }else {
            LOGGER.error("");
            return false;
        }
    }
}
