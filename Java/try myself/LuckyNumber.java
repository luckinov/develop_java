import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {
        public static List<Integer> luckyNumber(int[][] matrix) {//
            int m = matrix.length, n = matrix[0].length;
            int[] minRow = new int[m];
            Arrays.fill(minRow, Integer.MAX_VALUE);
            int[] maxCol = new int[n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    minRow[i] = Math.min(minRow[i], matrix[i][j]);
                    maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
                }
            }
            List<Integer> ret = new ArrayList<Integer>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {//矩阵中每个元素不同
                        ret.add(matrix[i][j]);
                    }
                }
            }
            return ret;
        }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean isMin = true, isMax = true;
                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        isMin = false;
                        break;
                    }
                }
                if (!isMin) {
                    continue;
                }
                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > matrix[i][j]) {
                        isMax = false;
                        break;
                    }
                }
                if (isMax) {
                    ret.add(matrix[i][j]);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] M = {{3,7,8},
                { 9, 11, 13 },
                { 18,16,17} };
        System.out.println(luckyNumber(M));
    }
}
