package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StirngPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatString " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatStringBuilder " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatStringBuffer " + (fim - inicio) + " ms");
    }

    private static void concatString(int tamanho){
        String texto  = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=1;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
