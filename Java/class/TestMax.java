public class TestMax {
    public static int max(int a, int b) {

        if (a > b)
            return a;
        else
            return b;

    }

    public static int max(int a, int b, int c) {
        int result = 0;
        result = max(max(a, b), c);
        return result;
    }
    public static void main(String[] args) {
        
        
        System.out.println("the max is "+max(1,3));
    }
}
