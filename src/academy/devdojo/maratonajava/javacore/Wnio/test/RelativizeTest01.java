package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/filipe");
        Path clazz = Paths.get("/home/filipe/devdojo/OlaMundo.txt");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/filipe");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/filipe/devdojo/OlaMundo.txt");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2032535");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("1 "+absoluto3.relativize(absoluto1));
        System.out.println("1 "+absoluto1.relativize(absoluto2));
        System.out.println("1 "+relativo1.relativize(relativo2));
//        System.out.println("1 "+absoluto1.relativize(relativo1)); //Java não sabe trabalhar com absoluto + relativo por isso lança exception.
    }
}
