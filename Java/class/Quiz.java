import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " max");
        } else if (b >= a && b >= c) {
            System.out.println(b + " max");
        } else {
            System.out.println(c + " max");
        }
    }
}
