public class SelectionSort {
    public static void main(String[] args) {
        double[] num = { 1, 9, 4.5, 6.6, 5.7, -4.5 };
        selectionSort(num);
        for (int i = 0; i < num.length-1;i++)
        System.out.print(num[i]+" ");
    }

    public static void selectionSort(double[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            double min = num[i];
            int index = i;
            for (int j = i + 1; j < num.length; j++) {
                if (min > num[j]) {
                    min = num[j];
                    index = j;
                }
            }
            if (index!=i)
                num[index] = num[i];
            num[i]= min;
        }
    }
}
