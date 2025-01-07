package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 290);
        Carro c3 = new Carro("Audi", 300);

        System.out.println("Antigo limite: " + Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(180);
        System.out.println("Novo limite: " + Carro.getVelocidadeLimite());

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
