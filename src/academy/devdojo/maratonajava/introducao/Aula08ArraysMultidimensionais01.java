package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];

        dias[0][0] = 15;
        dias[0][1] = 25;
        dias[0][2] = 35;

        dias[1][0] = 33;
        dias[1][1] = 32;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------");
        //utilizando o foreach obtendo o mesmo resultado
        for (int[] arrBase : dias){
            for (int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
