package quiz;

import java.util.Scanner;

public class w4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 3 || i == 7)
                continue;
            System.out.println(i); 
        }
    }
    
}
