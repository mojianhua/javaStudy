package AOPTest.utils;

import java.util.Arrays;

public class LogUtils {

    public static void LogStart(Object... objects){
        System.out.println("[xxxx]方法开始了，他的参数是【" + Arrays.asList(objects) + "]");
    }
}
