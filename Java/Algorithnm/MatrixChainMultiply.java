package Algorithnm;

public class MatrixChainMultiply {
    private static int[][] rec;

    public static void main(String[] args) {
        int[] p = { 2, 3, 7, 9, 5, 2, 4 };
        rec = new int[p.length][p.length];
        int result = matrixChainMultiply(p);
        System.out.println("一共计算了" + result + "次");
        printMatrixChain(1, p.length - 1);
        
    }
    

    private static int matrixChainMultiply(int[] p) {
        int n = p.length - 1;
        int[][] D = new int[n + 1][n + 1];

        for (int len = 2; len <= n; len++) {
            for (int i = 1; i <= n - len + 1; i++) {//
                int j = i + len - 1;
                D[i][j] = Integer.MAX_VALUE;//初始化无穷大

                for (int k = i; k <= j - 1; k++) {
                    int q = D[i][k] + D[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < D[i][j]) {
                        D[i][j] = q;
                        rec[i][j] = k;
                    }
                }
            }
        }
        System.out.println("dp数组：");
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }
        return D[1][n];
    }

    private static void printMatrixChain(int i, int j) {
        if (i == j) {
            System.out.print("M" + i);
        } else {
            System.out.print("(");
            printMatrixChain(i, rec[i][j]);
            System.out.print(")");
            printMatrixChain(rec[i][j] + 1, j);
        }
    }
}
