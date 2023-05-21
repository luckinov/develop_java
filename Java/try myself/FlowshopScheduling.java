public class FlowshopScheduling {
    public static int findMinCompletionTime(int[][] processingTimes) {
        int m = processingTimes[0].length; // 机器数量
        int n = processingTimes.length; // 工序数量

        int[][] dp = new int[n][m];

        // 初始化第一行
        dp[0][0] = processingTimes[0][0];
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + processingTimes[0][j];
        }

        // 初始化第一列
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + processingTimes[i][0];
        }

        // 计算剩余单元格的值
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + processingTimes[i][j];
            }
        }

        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] processingTimes = { { 2, 3, 4 }, { 1, 2, 3 }, { 3, 2, 1 } };
        int minCompletionTime = findMinCompletionTime(processingTimes);
        System.out.println("最短完成时间: " + minCompletionTime);
    }
}
