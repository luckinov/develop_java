import java.util.Scanner;

public class GuessNumberonetime {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("guess num 0 to 100");
        int guess = -1;
        
        while (guess != num) {
            System.out.println("enter guess");
            guess = input.nextInt();
            if (guess > num)
                System.out.println("it is too high");
            else
                System.out.println("it is too low");
        }
        System.out.println("yes it is" + num);
    }
}
