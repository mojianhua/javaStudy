package AOPTest.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 如何将这个类（切面类）中的这些方法（通知方法）动态的在目标方法运行的各个位置切入
 * */
//告诉Spring到底在哪个是切面类@Aspect
@Aspect
//将目标类和切面类（封装了通知方法（在目标方法行前后执行的方法)）加入到IOC容器中
@Component
public class LogUtils {

    /**
     * 告诉spring每个方法都什么时候运行
     *
     * try{
     *      @Before
     *      method.invoke(obj,args);
     *      @AfterReturning
     * }catch(e){
     *      @AfterThrowing
     * }finally{
     *      @After
     * }
     *
     * @Before:在目标方法之前运行,前置通知
     * @After:在目标方法结束之后,后置通知
     * @AfterReturning,在目标方法正常返回之后,返回通知
     * @AfterThrowing:在目标方法旁出异常之后运行,异常通知
     * @Around:环绕，环绕通知
     * */

    //想在执行目标方法之前运行
    //execution(访问权限 返回值类型 方法签名)
    @Before("execution(public int AOPTest.impl.MyMathCalculator.*(int,int))")
    public static void logStart(Method method,Object... args){
        System.out.println("["+method.getName()+"]方法开始执行，用的参数是"+ Arrays.asList(args));
    }

    //想在目标方法有结果的时候执行
    @AfterReturning("execution(public int AOPTest.impl.MyMathCalculator.*(int,int))")
    public static void logResult(Method method,Object... args){
        System.out.println("[" + method.getName()+ "]方法执行的结果是" + Arrays.asList(args));
    }

    //想在目标方法出现异常的时候执行
    @AfterThrowing("execution(public int AOPTest.impl.MyMathCalculator.*(int,int))")
    public static void logException(Method method,Object... args){
        System.out.println("[" + method.getName() + "]方法异常了，异常信息是" + Arrays.asList(args));
    }

    public static void logFinally(Method method,Object... args){
        System.out.println("[" + method.getName() + "]方法最终结果：" + Arrays.asList(args));
    }

    //想在目标方法结束的时候执行
    @After("execution(public int AOPTest.impl.MyMathCalculator.*(int,int))")
    public static void logEnd(Method method,Object... args){
        System.out.println("[" + method.getName() + "]方法最终结束：" + Arrays.asList(args));
    }
}
