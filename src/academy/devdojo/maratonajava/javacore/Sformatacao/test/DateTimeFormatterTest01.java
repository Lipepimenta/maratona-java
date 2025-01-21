package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //Formatter está tranformando seu objeto para string;
        //Parse está transformando sua string em objeto;

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250121", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-01-21", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-01-21", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2025-01-21T07:29:42.6884014", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("21/01/2025", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("21.Januar.02025", dateTimeFormatter);
        System.out.println(parseGR);
    }
}
