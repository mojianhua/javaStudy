package factory;

public class AirPlaneStaticFactory {

    /**
     * 静态工厂
     * */
    public static AirPlane getAirPlane(String jzName){
        System.out.println("静态工厂启动..............");
        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setFjsName("lfy");
        airPlane.setJzName(jzName);
        airPlane.setPersonNum(300);
        airPlane.setYc("198.98m");
        return airPlane;
    }
}
