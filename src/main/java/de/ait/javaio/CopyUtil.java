package de.ait.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyUtil {

    public static void main(String[] args) {
            try {
                File fileSource = new File("password.txt");
                File fileDestination = new File((String) null);
                File fileDestinationNew = new File("passwordNewCopy.txt");
                boolean result = fileDestination.renameTo(fileDestinationNew);

                Files.copy(fileSource.toPath(),fileDestination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
    }
}
