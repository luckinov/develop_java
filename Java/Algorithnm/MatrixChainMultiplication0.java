package Algorithnm;

public class MatrixChainMultiplication0 {
    public static int matrixChainMultiplication(int[] dimensions) {
        int n = dimensions.length; // 矩阵数量

        // 创建一个二维数组dp来保存中间结果
        int[][] dp = new int[n][n];

        // 初始化对角线元素
        for (int i = 0; i < n; i++) {
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

        return dp[1][n - 1]; // 返回最终结果
    }

    public static void main(String[] args) {
        int[] dimensions = { 2, 3, 7, 9, 5, 2, 4 };
        int minMultiplications = matrixChainMultiplication(dimensions);
        System.out.println("最小乘法次数：" + minMultiplications);
    }
}
