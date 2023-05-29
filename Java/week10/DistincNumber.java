package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class DistincNumber {
    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n;
        do{
            n = input.nextInt();
            if (!iList.contains(n) && n !=0)
            iList.add(n);
        }
        while (n != 0);
        System.out.println(iList);

    }
}
