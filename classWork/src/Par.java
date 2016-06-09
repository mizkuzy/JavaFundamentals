public class Par {
    static {
        System.out.println("static block Par");
    }
    {
        System.out.println("logic block Par");
    }


    static void stm(){}
    public Par() {
        System.out.println("constructor Par");
    }

    private void method(){
        System.out.println("method");
    }
}
