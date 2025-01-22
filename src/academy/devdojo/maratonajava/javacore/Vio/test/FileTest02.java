package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileArquivoRenamed = new File(fileDiretorio, "arquivo-renomeado.txt");
        boolean isArquivoRenamed = fileArquivoDiretorio.renameTo(fileArquivoRenamed);
        System.out.println(isArquivoRenamed);

        File fileDiretorioRenamed = new File("past2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(fileDiretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
