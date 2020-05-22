public abstract class Shape {
    public String getName(){
        //获取图形名称
        return this.getClass().getSimpleName();
    }

    //获取图形面积
    public abstract double getArea();
}
