package factory;

/**
 * 动态工厂
* */
public class AirPlaneInstanceFactory {

    public AirPlane getAirPlane(String jzName){
        System.out.println("AirPlaneInstanceFactory动态工厂....");
        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("动态太行发动机");
        airPlane.setFjsName("lfy");
        airPlane.setFjsName(jzName);
        airPlane.setPersonNum(301);
        airPlane.setYc("200m");
        return airPlane;
    }
}
