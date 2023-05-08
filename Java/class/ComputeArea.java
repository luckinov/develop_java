public class ComputeArea {
    public static void main(String[] args) {
        final double PI = 3.14159;//constant
        double radius;
        double area;

        radius = 20;

        area = radius * radius * PI;
        System.out.println("the area for the circle of radius "+radius + " is "+area);
    }
}
