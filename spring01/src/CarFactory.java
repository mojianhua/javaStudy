public class CarFactory {
    //工厂模式
    public static CarAbstract getCar(String name){
        //如果需要BMW则创建BMW对象
        if(name.equalsIgnoreCase("BMW")){
            return new BMW();
        }else if(name.equalsIgnoreCase("Benz")){
            return new Benz();
        }else{
            return null;
        }
    }
}
