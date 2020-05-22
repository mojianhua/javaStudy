public class Cire implements ICalculate {

    //定义计算面积
    public float getArea(float r){
        float area = PI * r * r;
        return area;
    }

    //定义计算周长的方法
    public float getCircumFerence(float r){
        float circumFerence = 2 * PI * r;
        return circumFerence;
    }
}
