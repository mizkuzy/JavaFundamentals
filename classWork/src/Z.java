public class Z {
    void m(Child child){
        System.out.println("m Child");
    }

    void m(Child1 child1){
        System.out.println("m Child1");
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.m((Child)null);
    }
}

