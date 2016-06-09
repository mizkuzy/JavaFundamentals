
public class Outer1 {
    private String string;
    private int anInt;

    public Outer1(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }

    public void method(){
        System.out.println(string);
        System.out.println(anInt);
    }

    class Inner{
        int anInt;
        public void method(){
            System.out.println(string);
            System.out.println(anInt);
        }
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1("outer1", 1);
        outer1.method();

        System.out.println(outer1.anInt);

    }
}
