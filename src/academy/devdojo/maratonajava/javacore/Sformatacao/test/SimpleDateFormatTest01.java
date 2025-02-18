package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        System.out.println("------------");

        String pattern2 = "'Filipinas' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date()));

        System.out.println("------------");

        try {
            System.out.println(sdf2.parse("Filipinas 19 de jan. de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
