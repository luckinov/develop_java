package week8;

import java.text.SimpleDateFormat;
import java.util.Random;

public class testStop {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(100000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        StopWatch stop = new StopWatch();
        stop.setStartTime();
        selectionSort(numbers);
        stop.setEndTime();

        String st = dateFormat.format(stop.getStartTime());
        String et = dateFormat.format(stop.getEndTime());
        System.out.println(st);
        System.out.println(et);
        System.out.println(stop.getTimeDifference()+"milliseconds");

        System.out.println(stop.getEndTime()-stop.getStartTime()+"ms");

    }
    
    private static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
