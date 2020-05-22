import java.awt.*;

public class TestCat {
    public static void main(String[] args){
        Cat cat1 = new Cat("j1",12,21, Color.BLACK);
        Cat cat2 = new Cat("c2",31,12.2,Color.YELLOW);
        Cat cat3 = new Cat("j1",12,21,Color.BLACK);
        System.out.println("猫咪1哈希：" + cat1.hashCode());
        System.out.println("猫咪2哈希：" + cat2.hashCode());
        System.out.println("猫咪3哈希：" + cat3.hashCode());
        System.out.println("猫咪1是等于猫咪2：" + cat1.equals(cat2));
        System.out.println("猫咪1是等于猫咪3：" + cat1.equals(cat3));
    }
}
