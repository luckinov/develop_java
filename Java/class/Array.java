import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] num = { 6, 4, 5, 9, 3, 8 };
        for (int i = 0; i < 6; i++)
        System.out.print(num[i]+" ");
       System.out.println();
        java.util.Arrays.sort(num);
        for ( int i = 0; i < 6;i++)
            System.out.print(num[i] + " ");
        System.out.println();
        System.out.println(Arrays.binarySearch(num, 5));
        System.out.println(Arrays.binarySearch(num, 0, 6, 5));

    
        Arrays.fill(num, 5);//5 5 5 5 5 5
        Arrays.fill(num, 1,3,8);

        for (int i = 0; i < 6; i++)
           System.out.print(num[i] + " ");
    }
}
