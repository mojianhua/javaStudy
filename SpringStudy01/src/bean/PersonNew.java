package bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PersonNew {
    private CarNew carNew;
    private List<BookNew> bookNew;
    private Map<String,Object> maps;
    private Properties properties;
    private String lastName;

    public void setCarNew(CarNew carNew){
        this.carNew = carNew;
    }

    public CarNew getCarNew(){
        return carNew;
    }

    public List<BookNew> getBooks(){
        return bookNew;
    }

    public void setBookNew(List<BookNew> bookNew){
        this.bookNew = bookNew;
    }

    public void setMaps(Map<String,Object> maps){
        this.maps = maps;
    }

    public Map<String,Object> getMaps(){
        return maps;
    }

    public void setProperties(Properties properties){
        this.properties = properties;
    }

    public Properties getProperties(){
        return properties;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }
}
