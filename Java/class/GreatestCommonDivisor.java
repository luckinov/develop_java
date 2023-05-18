import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter first");
            int n1 = input.nextInt();

            System.out.println("the second int");
            int n2 = input.nextInt();

            int gcd = 1;
            int k = 2;
            while (k <= n1 && k <= n2) {
                if (n1 % k == 0 && n2 % k == 0)
                    gcd = k;
                k++;
            }
   System.out.println("gcd : "+ gcd);
        }
    }
    
    
}
