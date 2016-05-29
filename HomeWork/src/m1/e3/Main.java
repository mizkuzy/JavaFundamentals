package m1.e3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static final double STEP = 0.5;

    public static void main(String[] args) {
        List<List<Double>> results = countFunction(-Math.PI / 2, Math.PI / 2, STEP);
        showResults(results);
    }

    private static List<List<Double>> countFunction(double a, double b, double step) {
        List<List<Double>> results = new ArrayList<>();
        double result;

        int count = 0;
        for (double i = a; i < b; i = i + step) {

            result = Math.tan(2 * i) - 3;

            results.add(new ArrayList<>());
            results.get(count).add(i);
            results.get(count).add(result);
            count++;
        }
        return results;
    }

    private static void showResults(List<List<Double>> results) {
        for (List<Double> d : results) {
            for (Double dd : d) {
                System.out.printf("%.2f", dd);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
