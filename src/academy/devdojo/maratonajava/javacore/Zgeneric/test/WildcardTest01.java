package academy.devdojo.maratonajava.javacore.Zgeneric.test;

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando o doguinho");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando o gatinho");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatoes = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatoes);
        Animal[] animals = {new Gato(), new Cachorro()};
        Animal animal = new Gato();
        printConsulta(animals);
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
    }
}
