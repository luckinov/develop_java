import java.util.*;

public class Numeric {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter for variable: ");
            /*
            int seconds = input.nextInt();
            int minutes = seconds / 60;
            int minutesreminder = seconds % 60;
            System.out.println(seconds + "second is " + minutes + " remind seconds " + minutesreminder);*/
            /* System.out.println(Math.pow(2,3));
            System.out.println(Math.pow(2.5, -2));
            long ssn = 232_45_4519L;//L区别long变量
            System.out.println(ssn+1); */
            double fahernheit = input.nextDouble();

            double celsius = (5.0 / 9) * (fahernheit - 32);
            System.out.printf("c is %.2f f is %.2f", celsius,fahernheit);

        
        }
    }
}
