package Algorithnm;

import java.util.ArrayList;
import java.util.List;

public class MatrixChainMultiplication {
    public static int matrixChainMultiplication(int[] dimensions, List<String> order) {
        int n = dimensions.length; // 矩阵数量

        // 创建一个二维数组dp来保存中间结果
        int[][] dp = new int[n][n];
        // 创建一个二维数组parenthesis来保存矩阵相乘的方式
        String[][] parenthesis = new String[n][n];

        // 初始化对角线元素
        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }

        // 计算dp数组的其他元素
        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dimensions[i - 1] * dimensions[k] * dimensions[j];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        parenthesis[i][j] = "(" + parenthesis[i][k] + parenthesis[k + 1][j] + ")";
                    }
                }
            }
        }

        // 打印dp数组
        System.out.println("dp数组：");
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        // 打印矩阵相乘的方式
        System.out.println("矩阵相乘的方式：");
        System.out.println(parenthesis[1][n - 1]);

        getMatrixOrder(parenthesis, 1, n - 1, order);

        return dp[1][n - 1]; // 返回最终结果
    }

    public static void getMatrixOrder(String[][] parenthesis, int i, int j, List<String> order) {
        if (i == j) {
            order.add("A" + i);
        } else {
            String p = parenthesis[i][j];
            int k = Integer.parseInt(p.substring(1, p.length() - 1));
            getMatrixOrder(parenthesis, i, k, order);
            getMatrixOrder(parenthesis, k + 1, j, order);
        }
    }

    public static void main(String[] args) {
        int[] dimensions = { 2, 3, 7, 9, 5, 2, 4 };
        List<String> order = new ArrayList<>();
        int minMultiplications = matrixChainMultiplication(dimensions, order);
        System.out.println("最小乘法次数：" + minMultiplications);
        System.out.println("矩阵相乘的顺序：");
        for (String o : order) {
            System.out.println(o);
        }
    }
}
