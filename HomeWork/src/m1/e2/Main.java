package m1.e2;

public class Main {

    private static void findNumber(double epsilon) {
        System.out.println("If epsilon = "+epsilon);
        if (epsilon > 1) {
            System.out.println(1);;
        } else if (epsilon == 1) {
            System.out.println(2);;
        } else {
            for (int i = 0; ; i++) {
                double result = 1 / Math.pow((i + 1), 2);
                System.out.print("  " + result);
                if (result < epsilon) {
                    System.out.println();
                    System.out.println("Number: "+ (i+1));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        findNumber(1);
        findNumber(5);
        findNumber(0.031);
    }
}
