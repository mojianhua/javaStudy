package abstractStudy;

public class Rectctangle extends Shape {
    private double length;
    private double width;

    //构造函数，取得矩形的长和宽
    public Rectctangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }
}
