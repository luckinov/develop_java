package Algorithnm;

public class LongestCommonSubsequence {
    public static String longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] L = new int[m + 1][n + 1];

        // 初始化第一行和第一列为0
        for (int i = 0; i <= m; i++) {
            L[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            L[0][j] = 0;
        }

        // 动态规划计算最长子序列长度
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // 当前字符相等，最长子序列长度加1
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    // 当前字符不相等，取左边或上边最长子序列长度的较大值
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        // 根据dp数组回溯，构造最长子序列
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                // 当前字符相等，加入最长子序列，并向左上方移动
                sb.insert(0, s1.charAt(i - 1));
                i--;
                j--;
            } else {
                // 当前字符不相等，根据dp数组的大小关系选择移动方向
                if (L[i - 1][j] > L[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
            for (i = 0; i < m+1; i++) {
                for (j = 0; j < n+1; j++) {
                    System.out.print(L[i][j] + "\t");
                }
                System.out.println();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "stone";
        String s2 = "longest";
        String longest = longestCommonSubsequence(s1, s2);
        System.out.println("Longest Common Subsequence: " + longest);
        System.out.println("L数组：");
        
    }
}
