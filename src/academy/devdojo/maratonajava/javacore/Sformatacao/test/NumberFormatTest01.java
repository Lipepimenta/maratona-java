package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[2] = NumberFormat.getInstance(localeBR);
        numberFormats[3] = NumberFormat.getInstance(localeIT);

        double valor = 1_000_000.2356;

        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2356";
        try {
            System.out.println(numberFormats[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
