public class Main {

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public int m1() {
                return 0;
            }

            @Override
            public String m3(String s) {
                return "string";
            }
        };

        /*MyInterface myInterface = new MyInterface() {
            @Override
            public int m1() {
                return 0;
            }
        };*/
        System.out.println(myInterface.m1());
        System.out.println(myInterface.m2(5));
        System.out.println(myInterface.getClass());

    }
}
