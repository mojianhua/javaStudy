package bean;

public class Person {
    private String LastName;
    private int age;
    private String gender;
    private String email;

    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    public String getLastName(){
        return LastName;
    }

    public void setAge(int age){
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
