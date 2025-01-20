package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Locale[] locales = {
            new Locale("it", "IT"),
            new Locale("it", "CH"),
            new Locale("hi", "IN"),
            new Locale("ja", "JP"),
            new Locale("nl", "NL")
        };

        String[] countryNames = {"Itália", "Suíça", "Ìndia", "Japão", "Holanda"};

        for (int i = 0; i < locales.length; i++) {
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locales[i]);
            System.out.println(countryNames[i] + " : " + dateFormat.format(calendar.getTime()));
        }
//        Locale localeItaly = new Locale("it", "IT");
//        Locale localeCH = new Locale("it", "CH");
//        Locale localeIndia = new Locale("hi", "IN");
//        Locale localeJapao = new Locale("ja", "JP");
//        Locale localeHolanda = new Locale("nl", "NL");
//
//        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
//        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
//        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
//        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
//        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
//
//        System.out.println("Italia "+df1.format(calendar.getTime()));
    }
}
