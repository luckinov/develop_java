package week9;

public class Circle extends GeometricObject {
    private double radius;
    private static int numberOfObjects;
//default
    public Circle() {

        numberOfObjects++;
    }

    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    public Circle(double newRadius, String color, boolean filled) {
        radius = newRadius;
        setColor(color);
        setFilled(filled);
        numberOfObjects++;
    }
    
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * Math.PI * radius;
    }
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

  @Override
   public String toString() {
       return super.toString() + "\nradius : " + radius;
    }
}
