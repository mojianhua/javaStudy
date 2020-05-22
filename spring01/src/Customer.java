public class Customer {
    public static void main(String[] args){
        CarAbstract bmw = CarFactory.getCar("BMW");
        System.out.println("提取汽车：" + bmw.getInfo());
    }
}
