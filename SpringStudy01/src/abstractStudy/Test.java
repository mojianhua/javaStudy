package abstractStudy;

public class Test {
    public static void main(String[] args){
        //设置圆形对象并将半径设置
        Circle circle = new Circle(1);
        System.out.println("圆形的名称是：" + circle.getName());
        System.out.println("圆形的面积是：" + circle.getArea());
        //矩形面积和名称
        Rectctangle rectctangle = new Rectctangle(1,2);
        System.out.println("矩形的名称是：" + rectctangle.getName());
        System.out.println("矩形的面积是：" + rectctangle.getArea());
    }
}
