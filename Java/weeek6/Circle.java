package weeek6;
public class Circle {
    double radius;

    Circle() {
        radius = 1;
    }
    Circle(double newRadius) {
        radius = newRadius;
    } 
    
    double getArea() {
        return radius * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
   } 
}
