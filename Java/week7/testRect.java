package week7;

public class testRect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 4);
        
        r1.setLength(10);
        double area = r1.getArea();
        double area2 = r2.getArea();
        System.out.println(area);
        System.out.println(area2);

    }
}
