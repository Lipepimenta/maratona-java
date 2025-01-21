package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        * . 1.3 = 123, 133, 1@3, 1a3
        * ^ pega o primeiro item
        * ^\w+ pega a primeira palavra até o primeiro espaço
        * [^abc] pega tudo menos abc
        * */

//        String regex = "[abc]";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
//        String texto2 = "abababa";

        System.out.println("Email Valido:");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());

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
