package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    public abstract void load();

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize da interface");
    }
}
