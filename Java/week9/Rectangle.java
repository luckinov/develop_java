package week9;

public class Rectangle extends GeometricObject{
    double length;
    double width;

    public Rectangle() {//前面加public其他文件夹中加上 import week7.*; 就可以用调用的时候前面写week7.
        width = 1;
        length = 1;
    }

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;

    }
    
    public Rectangle(double length, double width,String color, boolean filled) {
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
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
