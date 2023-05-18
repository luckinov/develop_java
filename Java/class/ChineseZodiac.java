import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the year");
            int y = input.nextInt();
            int a = y % 12;
            switch (a) {
                case 0:
                    System.out.println(y + " is monkey");
                    break;
                case 1:
                    System.out.println(y + " is rooster");
                    break;
                case 2:
                    System.out.println(y + " is dog");
                    break;
                case 3:
                    System.out.println(y + " is pig");
                    break;
                case 4:
                    System.out.println(y + " is rat");
                    break;
                case 5:
                    System.out.println(y + " is ox");
                    break;
                case 6:
                    System.out.println(y + " is tiger");
                    break;
                case 7:
                    System.out.println(y + " is rabbit");
                    break;
                case 8:
                    System.out.println(y + " is dragon");
                    break;
                case 9:
                    System.out.println(y + " is snake");
                    break;
                case 10:
                    System.out.println(y + " is horse");
                    break;
                case 11:
                    System.out.println(y + " is sheep");
                    break;
            }
        }
    }
}
