package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
       conexao2();
    }

    private static String conexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
//            throw new RuntimeException();
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberando SO");
        }
        return null;
    }

    private static String conexao2(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
//            throw new RuntimeException();
            return "conexão aberta";
        } finally {
            System.out.println("Fechando recurso liberando SO");
        }
    }
}
