public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        while (num < 20) {
            num++;
            if (num == 10 || num == 11) {
                continue; //if no this sum will be 210
            }
            sum += num;
        }
        System.out.println("the sum is "+sum);
    }
}
