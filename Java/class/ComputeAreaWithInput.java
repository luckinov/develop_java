import java.util.Scanner;
public class ComputeAreaWithInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter a number for radius:");
            double radius = input.nextDouble();
            //compute the area
            if (radius<0)
                System.out.println("input error!");
            else {
                double area = radius * radius * 3.14159;
                System.out.println("the area for the circle of radius " + radius + " is " + area);
            }
        }
    }
}
