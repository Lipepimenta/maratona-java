package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{}
}
