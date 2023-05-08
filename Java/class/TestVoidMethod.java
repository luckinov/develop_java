public class TestVoidMethod {
    public static void main(String[] args) {
        Grade(77);
        return;
    }
    
    public static void Grade(double data) {
        if (data>=90.0)
            System.out.println('A');
        else if (data >= 80)
            System.out.println('B');
        else   if (data >= 70)
            System.out.println('C');
        else    if (data >= 60)
            System.out.println('D');
        else    if (data <60.0)
            System.out.println('E');
        
    }
}
