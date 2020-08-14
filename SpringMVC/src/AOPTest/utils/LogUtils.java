package AOPTest.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 如何将这个类（切面类）中的这些方法（通知方法）动态的在目标方法运行的各个位置切入
 * */
public class LogUtils {

    public static void LogStart(Method method,Object... args){
        System.out.println("["+method.getName()+"]方法开始执行，用的参数是"+ Arrays.asList(args));
    }

    public static void LogResult(Method method,Object... args){
        System.out.println("[" + method.getName()+ "]方法执行的结果是" + Arrays.asList(args));
    }

    public static void LogException(Method method,Object... args){
        System.out.println("[" + method.getName() + "]方法异常了，异常信息是" + Arrays.asList(args));
    }

    public static void LogFinally(Method method,Object... args){
        System.out.println("[" + method.getName() + "]方法最终结果：" + Arrays.asList(args));
    }
}
