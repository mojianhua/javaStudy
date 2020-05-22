public class Student {
    private int id;
    private String name;
    private boolean male;
    private double account;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMale(boolean male){
        this.male = male;
    }

    public boolean getMale(){
        return male;
    }

    public void setAccount(double account){
        this.account = account;
    }

    public double getAccount(){
        return account;
    }
}
