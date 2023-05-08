public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i + 1;
        }
        System.out.print(sum);
    }
}
