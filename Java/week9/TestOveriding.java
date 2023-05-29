package week9;

public class TestOveriding {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}
class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}
class A extends B {
    public void p(double i) {
        System.out.println(i);
        super.p(i);
    }
    public void p(int i) {
        System.out.println(i);
        super.p(i);
    }
}

