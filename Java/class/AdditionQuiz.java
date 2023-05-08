import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 10);//generate random numbers
        int num2 = (int)(Math.random()*10);

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("what is " + num1 + "+ " + num2 + "? ");
            
            int answer = input.nextInt();
            System.out.printf("%d + %d = %d is ",num1,num2,answer);
            System.out.print(num1 + num2 == answer);
            while (num1 + num2 != answer) {
                System.out.println("try again");
                answer = input.nextInt();
            }
            System.out.println("success");
        }
        
    }
}
