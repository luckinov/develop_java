import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a int for year:");
        int y = input.nextInt();
        int b = y % 4;
        int c =y %100;
        int d =y %400;
    
        if(b==0 && c!=0 ||d ==0)
            System.out.println("the year is leap year " + y);
        else
        System.out.println("not a leap year");

    }
}
