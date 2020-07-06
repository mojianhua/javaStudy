package bean;

public class Car {
    private String carName;
    private String color;
    private int price;

    public void setCarName(String carName){
        this.carName = carName;
    }

    public String getCarName(){
        return carName;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setPrice(int price) {
         this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
