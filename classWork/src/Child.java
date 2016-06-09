public class Child extends Par {
    int smth;

    static void stm(){}

    static {
        System.out.println("static block Child");
    }

    {
        System.out.println("logic block Child");
    }

    public Child() {
        System.out.println("constructor Child");
    }

    public Child(int i) {
        this();
        this.smth = i;
    }

    public void method() {
        System.out.println("method child");
    }


    public static void main(String[] args) {
        Child child1 = new Child();
        Child child2 = new Child(0);
    }
}
