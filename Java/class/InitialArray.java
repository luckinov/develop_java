

public class InitialArray {
    public static void max(double[] num) {
        double max = 0;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= max) {
                max = num[i];
                index = i;
            }
        }
        System.out.println("max is "+max+" index is "+index);
    }
    public static void randswap(double[] num) {
        for (int i = 0; i < num.length; i++) {
            int j = (int) (Math.random() * 10);
            double temp = num[i];
            num[i] = num[j];
            num[j] = temp;

        }


        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f ", num[i]);
        }
    
}

public static void main(String[] args) {

    double[] num = new double[10];
    for (int i = 0; i < 10; i++)
        num[i] = (Math.random() * 100);
    for (int i = 0; i < 10; i++)
        System.out.printf("%.2f ", num[i]);

    System.out.println();
    double total = 0;
    for (int i = 0; i < 10; i++) {
        total += num[i];
    }
    //System.out.printf("%.2f ", total);
    //System.out.println();

    //randswap(num);
    // max(num);
    double[] result = ReturnArray(num);
    System.out.println("the result is ");
    for (double  i: result)
        System.out.printf("%.2f ", i);
}

public static double[] ReturnArray(double[] num) {
    double[] result = new double[num.length];

    int i = 0;
    for (double e : num) {
        result[i] = e;
        i++;
    }
    return result;
    }
}
