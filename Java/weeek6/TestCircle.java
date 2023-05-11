package weeek6;



public class TestCircle {
    public static void main(String[] args) {
        // 创建默认半径为1的圆
        Circle c1 = new Circle();

        // 创建半径为5的圆
        Circle c2 = new Circle(5);

        // 计算圆的面积
        double area = c2.getArea();

        // 修改圆的半径
        c2.setRadius(10);
        System.out.println(area);
        System.out.println(c1.radius);
        
    }
}
