public class GCD {
    public static void main(String[] args) {
        int num1 = 8, num2 = 10;
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // 定义一个方法来查找最大公约数
    public static int findGCD(int a, int b) {//用的递归
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
