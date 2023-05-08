import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the weight in kg");
            double w = input.nextDouble();
            System.out.println("enter the height in cm");
            double h = input.nextDouble();
            h = h / 100;
            double bmi = w / (h * h);

            System.out.println("the BMI is " + bmi);
            if(bmi<18.5)
                System.out.println("underweight");
            else if(bmi<25.0)
                System.out.println("normal");
            else if (bmi <30)
                System.out.println("overweight");
            else if (bmi >30)
                System.out.println("obese");
        }
    }
}
