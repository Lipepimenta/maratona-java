package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print(){
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal(){
                System.out.println(name +" "+lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClasses = new OuterClassesTest02();
        outerClasses.print();
    }
}
