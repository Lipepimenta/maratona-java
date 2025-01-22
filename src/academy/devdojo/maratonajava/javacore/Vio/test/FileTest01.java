package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    File file = new File("file.txt");
    {
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created"+isCreated);
            System.out.println("path"+file.getPath());
            System.out.println("path absolute"+file.getAbsoluteFile());
            System.out.println("is file"+file.isFile());
            System.out.println("is hidden"+file.isHidden());
            System.out.println("last modified"+new Date(file.lastModified()));
            boolean exists = file.exists();
            if (exists){
                System.out.println(file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
