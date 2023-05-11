package week7;

public class Rectangle {
    double length;
    double width;

    public Rectangle() {//前面加public不影响
        width = 1;
        length = 1;
    }

    public Rectangle(double l, double w) {
        width = w;
        length = l;
        
    }
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double newLength) {
        length = newLength;
    }
    
    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}
