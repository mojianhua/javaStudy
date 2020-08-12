package AOPTest.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtils {

    public static void LogStart(Method method,Object... args){
        System.out.println("["+method.getName()+"]方法开始执行，用的参数是"+ Arrays.asList(args));
    }
}
