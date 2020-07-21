package factory;

public class AirPlane {

    private String fdj;
    private String yc;
    private Integer personNum; //载客量
    private String jzName; //机长名字
    private String fjsName; //副驾驶名字

    public void setFdj(String fdj){
        this.fdj = fdj;
    }

    public String getFdj(){
        return fdj;
    }

    public void setYc(String yc){
        this.yc = yc;
    }

    public String getYc(){
        return yc;
    }

    public void setPersonNum(Integer personNum){
        this.personNum = personNum;
    }

    public Integer getPersonNum(){
        return personNum;
    }

    public void setJzName(String jzName){
        this.jzName = jzName;
    }

    public String getJzName(){
        return jzName;
    }

    public void setFjsName(String fjsName){
        this.fjsName = fjsName;
    }

    public String getFjsName(){
        return fjsName;
    }

    @Override
    public String toString(){
        return "AirPlane [fdj =" + fdj + ", yc = " + yc + ", personNum = " + personNum + ", jzName = " + jzName +
                ",fjsName = " + fjsName + "]";
    }
}
