package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // bute, short, int, log, float, e double = 0
        // char '\u0000' ''
        //boolean false
        //String null
        String[] nomes = new String[4];
        nomes[0] = "Filipe";
        nomes[1] = "Sabrina";
        nomes[2] = "Rita";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
