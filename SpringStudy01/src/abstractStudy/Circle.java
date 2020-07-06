package abstractStudy;

public class Circle extends Shape {
    private double radius;

    //获得原型的半径
    public Circle(double radius){
        this.radius = radius;
    }

    //计算圆形的面积
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}
