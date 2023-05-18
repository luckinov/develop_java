package weeek6;
public class Circle {
    private double radius;
    private static int numberOfObjects;

    Circle() {

        numberOfObjects++;
    }

    Circle(double newRadius) {
        radius = newRadius;
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
}
