//import java.awt.*;
//
//public class Cat {
//
//    private String name;
//    private int age;
//    private double weight;
//    private Color color;
//
//
//    public Cat(String name, int age , double weight, Color color){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.color = color;
//    }
//
//    @Override
//    public boolean equals(Object obj){
//        //利用属性来判断猫咪是否相同
//        if(this == obj){
//            return true;
//        }
//
//        //如果两个猫咪有一个为null则不同
//        if(obj == null){
//            return false;
//        }
//
//        //如果两个猫咪的类型不同则不同
//        if(getClass() != obj.getClass()){
//            return false;
//        }
//
//        Cat cat = (Cat) obj;
//        return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && (color.equals(cat.color));
//    }
//
//    //重写hashCode方法
//    @Override
//    public int hashCode(){
//        return 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 13 * new Double(weight).hashCode() + 17 * color.hashCode();
//    }
//}
