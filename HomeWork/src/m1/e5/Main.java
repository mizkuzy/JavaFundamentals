package m1.e5;

public class Main {

    private static String[][] matrix = new String[6][7];

    public static void main(String[] args) {

        drawRightDiagonal();
        fillMatrix();
        showMatrix();
    }

    private static void showMatrix() {
        for (String[] aMatrix : matrix) {
            for (String anAMatrix : aMatrix) {
                System.out.print(anAMatrix + "  ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j) && (i < 3)) matrix[i][j] = "1";
                else if ((i == j) && (i > 3)) {
                    matrix[i][j] = "0";
                    matrix[i][j + 1] = "1";
                } else if (j == 3) {
                    if (i != 3) {
                        matrix[i][j] = "Λ";
                    } else matrix[i][j] = "O";
                } else if (i == 3) {
                    matrix[i][j] = "M";
                }
                else if (matrix[i][j] == null) {
                    matrix[i][j] = "0";
                }
            }
        }
    }

    private static void drawRightDiagonal() {
        int i = 0;
        for (int j = 6; j > 0; j--) {
            if (i < 3) {
                matrix[i][j] = "1";
            }
            if (i > 3) {
                matrix[i][j] = "0";
                matrix[i][j - 1] = "1";
            }
            i++;
        }
    }
}
