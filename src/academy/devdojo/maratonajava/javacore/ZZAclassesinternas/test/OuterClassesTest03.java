package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Filipe";

    static class Nested{
        private String lastname = "Pimenta";
        void print(){
            System.out.println(new OuterClassesTest03().name+" "+lastname);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
