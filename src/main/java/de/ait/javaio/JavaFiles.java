package de.ait.javaio;

import java.io.File;
import java.io.IOException;

public class JavaFiles {
    public static void main(String[] args) throws IOException {
        File fileOne = new File("");
        File fileOneNew = new File("");
        fileOne.mkdir();
        File fileTest = new File(fileOne.getAbsolutePath()+ "/testTest.txt");

        fileTest.renameTo(fileOneNew);
        System.out.println("list -->" + fileOne.list());
        for (int i = 0; i < fileOne.list().length; i++){
            System.out.println(fileOne.list());
        }

        System.out.println("TotalSpace -->" + fileOne.getTotalSpace());
        System.out.println("FreeSpace -->" + fileOne.getFreeSpace());
        System.out.println("UsableSpace -->" + fileOne.getUsableSpace());


        String path = fileOne.getPath();
        String pathAbsolute = fileOne.getAbsolutePath();
        System.out.println("path -->" + path);
        System.out.println("AbsolutePath--> " + pathAbsolute);
        System.out.println("created -->" + fileOne.createNewFile());
        System.out.println("name -->" + fileOne.getName());
        System.out.println("isAbsolute -->" + fileOne.isAbsolute());
        System.out.println("canRead -->" + fileOne.canRead());
        System.out.println("canWrite -->" + fileOne.canWrite());
        System.out.println("exists -->" + fileOne.exists());
        System.out.println("isFile -->" + fileOne.isFile());
        System.out.println("isHidden -->" + fileOne.isHidden());

        System.out.println("length -->" + fileOne.length());
        if (fileOne.exists() && fileOne.isFile()){
            //System.out.println("delete -->" + fileOne.delete());
        }


    }
}
