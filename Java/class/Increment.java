public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("befero the call x= " + x);
        increment(x);
        System.out.println("after the call x= " + x);

    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside is "+n);
        
    }
}
