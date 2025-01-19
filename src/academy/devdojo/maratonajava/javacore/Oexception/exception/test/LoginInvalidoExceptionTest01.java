package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernamedDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Digite seu usuário:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite sua senha:");
        String senhaDigitada = teclado.nextLine();
        if (!usernamedDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Login realizado com sucesso");
    }
}
