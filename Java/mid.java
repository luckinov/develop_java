import java.util.Scanner;

public class mid {
    public static int[][] getMatrix(int N) {
        int[][] matrix = new int[N][N];
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
                //get n*n matrix
            }
        }

        scanner.close();
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int d(int[][] matrix,int N) {
        int d = 0;
        int sumMain = 0, sumAnti = 0;
        for (int i = 0; i < N; i++) {
            sumMain += matrix[i][i];
            sumAnti += matrix[i][N - 1 - i];
        }
        d = sumMain - sumAnti;
        return d;
    }

    public static void main(String[] args) {
        int N = 3;
        int[][] matrix = getMatrix(N);
        
        printMatrix(matrix);
        System.out.println(d(matrix, N));

    }
}

    



