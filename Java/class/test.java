import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num");
        int num = input.nextInt();
        while (num > 10 || num <1) {
            System.out.println("enter num again");
            num = input.nextInt();
        }
        System.out.println("success");
    }
}
