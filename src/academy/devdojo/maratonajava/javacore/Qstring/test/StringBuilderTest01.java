package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome =  "Filipe";
        nome.concat(" Smith");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Filipe Smith");
        sb.append(" Desenvolve").append(" MUITOOO!");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
