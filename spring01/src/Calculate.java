public class Calculate {
    final float PI = 3.14159f;

    //求原形面积
    public float getArea(float r){
        float area = PI * r * r;
        return area;
    }

    //求矩形的面积
    public float getArea(float l,float w){
        float area = l * w;
        return area;
    }

    //画任意形状的图形
    public void draw(int num){
        System.out.println("画" + num + "个任意图形的图形");
    }

    //画指定形状的图形
    public void draw(String shape){
        System.out.println("画一个" + shape);
    }

    public static void main(String[] args){
        Calculate calculate = new Calculate();
        float l = 20;
        float w = 30;
        float areaRectangle = calculate.getArea(l,w);
        System.out.println("求长为" + l + "宽为" + w + "矩形面积是：" + areaRectangle);
        float r = 5;
        float areaCirc = calculate.getArea(r);
        System.out.println("求半径为" + r + "圆形的面积是" + areaCirc);
    }
}
