package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /*
        *  \d = Todos os digitos
        *  \D = Todos que não for digitos
        *  \s = Espaços em branco
        *  \S = Todos caracteres excluindo os brancos
        *  \w = a-AZ-A, digitos, -
        *  \W = Tudo o que não for incluso no \w
        * []
        * ? Zero ou uma
        * * Zero ou mais
        * + uma ou mais
        * {n,m} de n até m
        * ()
        * |
        * $
        * */

//        String regex = "[abc]";
        String regex = "0[xX]([0-9a-fA-F])+(\\S|$)";
        String texto = "12 0X 0x 0xFFABC 0x10G 0x1";
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
