package week9;



public class TestCircle {
    public static void printCircle(Circle c) {
        System.out.println("radius is " + c.getRadius() + " area is " + c.getArea()+"color " +c.getColor());
    }

    public static Circle[] creatCA() {
        Circle[] ca = new Circle[5];

        for (int i = 0; i < 5; i++) {
            ca[i] = new Circle(i);
        }
        return ca;
    }
    
    public static void printCircleArray(Circle[] ca) {
        int n = ca.length;
        for (int i = 0; i < n; i++) {
            System.out.println("the area is " + ca[i].getArea());
        }
    }

    public static void main(String[] args) {
        // 创建默认半径为1的圆
        
        
        Circle c1 = new Circle(1,"black",true);

        // 创建半径为5的圆
        Circle c2 = new Circle(5);

        // 计算圆的面积
        double area = c2.getArea();

        // 修改圆的半径
        c2.setRadius(10);
        printCircle(c1);
        //printCircleArray(creatCA());

    }
}
