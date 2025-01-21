package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        /*
        *  \d = Todos os digitos
        *  \D = Todos que não for digitos
        *  \s = Espaços em branco
        *  \S = Todos caracteres excluindo os brancos
        *  \w = a-AZ-A, digitos, -
        *  \W = Tudo o que não for incluso no \w
        * */

        String regex = "\\d";
        String texto = "vfdv1f32v4df354vvfvd4";
//        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
//        Matcher matcher2 = pattern.matcher(texto2);

        System.out.println("texto:   "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
//        while (matcher2.find()){
//            System.out.print(matcher2.start()+" ");
//        }
    }
}
