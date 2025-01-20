package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1_000_000.2356;

        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "￥1,000,000.24";
        try {
            System.out.println(numberFormats[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
