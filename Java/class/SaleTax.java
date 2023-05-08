import java.util.Scanner;

public class SaleTax {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter purchase : ");
            double purchaseAmount = input.nextDouble();
            double tax = purchaseAmount*0.06;
            System.out.println("sales tax is "+(int)(tax*100)/100.0);
        }
    }
}
