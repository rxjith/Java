package M1;


import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowA = readComponent(scanner, 'A', "rows");
        int colA = readComponent(scanner, 'A', "columns");
        int rowB = readComponent(scanner, 'B', "rows");
        int colB = readComponent(scanner, 'B', "columns");

        if (colA != rowB) {
            System.out.println("# of columns of A should equal # of rows of B.");
            return;
        }

        int[][] A = matrixReader(scanner, 'A', rowA, colA);
        int[][] B = matrixReader(scanner, 'B', rowB, colB);

        System.out.println("\nDisplaying Matrices:");
        matrixPrinter("A", A);
        System.out.println();
        matrixPrinter("B", B);

        System.out.println("\nProduct Matrix:");
        int[][] result = matrixMultiplier(A, B);
        matrixPrinter("Result", result);
        
        scanner.close();
    }

    static int readComponent(Scanner scanner, char matrixName, String componentName) {
        System.out.printf("Enter number of %s of [%c]: ", componentName, matrixName);
        return scanner.nextInt();
    }

    static int[][] matrixReader(Scanner scanner, char matrixName, int row, int col) {
        int[][] matrix = new int[row][col];
        System.out.printf("Enter elements into [%c]:\n", matrixName);

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.printf("Enter element [%d][%d]: ", r, c);
                matrix[r][c] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static int[][] matrixMultiplier(int[][] matrix1, int[][] matrix2) {
        int rowA = matrix1.length;
        int colA = matrix1[0].length;
        int colB = matrix2[0].length;

        int[][] result = new int[rowA][colB];

        for (int r = 0; r < rowA; r++) {
            for (int c = 0; c < colB; c++) {
                for (int e = 0; e < colA; e++) {
                    result[r][c] += matrix1[r][e] * matrix2[e][c];
                }
            }
        }
        return result;
    }

    static void matrixPrinter(String matrixName, int[][] matrix) {
        System.out.printf("[%s]:\n", matrixName);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}