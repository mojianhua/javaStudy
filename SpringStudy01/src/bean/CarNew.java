package bean;

public class CarNew {
    private String carName;
    private int price;
    private String color;

    //构造函数
    public CarNew(){
        super();
        System.out.println("carNew被创建....");
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public String getCarName(){
        return carName;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
       return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "CarNew [carName = " + carName + ",price = " + price + ",color =" + color + "]" ;
    }
}
