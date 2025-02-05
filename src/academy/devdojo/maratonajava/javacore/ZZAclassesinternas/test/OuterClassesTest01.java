package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey";

    class Inner {
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner1 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAtribute();
        inner1.printOuterClassAtribute();

    }
}
