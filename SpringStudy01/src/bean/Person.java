package bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private String lastName;
    private int age;
    private String gender;
    private String email;

    private Car car;
    private List<Book> books;
    private Map<String , Object> maps;
    private Properties properties;

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public List<Book> getBooks(){
        return books;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    public Map<String,Object> getMaps(){
        return maps;
    }

    public void setMaps(Map<String,Object> maps){
        this.maps = maps;
    }

    public Properties getProperties(){
        return properties;
    }

    public void setProperties(Properties properties){
        this.properties = properties;
    }

    //有参数构造器
    public Person(String lastName,Integer age,String gender,String email){
        super();
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        System.out.println("有参数构造器");
    }

    public Person() {
        super();
        System.out.println("Persion创建了");
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
