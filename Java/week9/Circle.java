package week9;

public class Circle extends GeometricObject {
    private double radius;
    private static int numberOfObjects;
//default
    Circle() {

        numberOfObjects++;
    }

    Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    Circle(double newRadius, String color, boolean filled) {
        radius = newRadius;
        setColor(color);
        setFilled(filled);
        numberOfObjects++;
    }
    
    public double getRadius() {
        return radius;
    }

    double getArea() {
        return radius * Math.PI * radius;
    }
    
    void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
   @Override
   public String toString() {
       return super.toString() + "\n radius : " + radius;
    }
}
