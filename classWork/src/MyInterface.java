public interface MyInterface {

    int m1();

    default int m2(int x) {
        return x + 5;
    }

    String m3(String s);
}
