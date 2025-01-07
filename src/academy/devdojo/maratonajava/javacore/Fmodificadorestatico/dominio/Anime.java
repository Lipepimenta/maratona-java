package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9};

    // 0 - Bloco de inicialiazação é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for
    // 3 - Bloco incializado é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloc de inicialização estatico00");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico01");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for (int episodios : Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
