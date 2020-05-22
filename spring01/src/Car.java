public class Car {
    private String name;
    private double speed;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("车名：" + name);
        sb.append("速度：" + speed + "千米/小时");
        return sb.toString();
    }
}
