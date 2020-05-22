//单利模式应用
public class Emperor {
    //声明Emperor应用
    private static Emperor emperor = null;

    //单例模式创建类的实例
    public static Emperor getInstance(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public void getName(){
        System.out.println("我是打杂：阿吉");
    }
}
