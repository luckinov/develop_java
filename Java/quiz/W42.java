package quiz;

import java.util.Scanner;

public class W42 {
    public static void main(String[] args) {
        int[] arr ;
        Scanner input = new Scanner(System.in);
            System.out.println("enter ");
        int n = input.nextInt();
        while (n >= 0) {
            n = input.nextInt();
        }
        System.out.println("first negative int is "+n);
    }
}
