public class fib {
    public static int fiba(int n) {
        int[] f = new int[n + 1];
        if (n <= 1)
            return n;
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i - 2] + f[i - 1];
        return f[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10;i++)
           System.out.println(fiba(i));
    }
}
