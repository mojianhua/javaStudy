public class EmperorTest {
    public static void main(String[] args){
        //对象1
        Emperor emperor1 = Emperor.getInstance();
        emperor1.getName();
        //对象2
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getName();
    }
}
