package abstractStudy;

public abstract class Shape {

    //获取图形名称
    public String getName(){
        return this.getClass().getSimpleName();
    }

    //获取图形的面积
    public abstract double getArea();
}
