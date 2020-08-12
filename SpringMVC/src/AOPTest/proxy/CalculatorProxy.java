package AOPTest.proxy;

import AOPTest.impl.MyMathCalculator;
import AOPTest.inter.Calculator;
import AOPTest.utils.LogUtils;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {

    /**
     * 为传入的参数对象创建一个动态代理对象
     * */
    public static Calculator getProxy(final Calculator calculator){

        //方法执行器
        InvocationHandler h = new InvocationHandler() {
            /**
             * Obejct proxy：代理对象；给jdk使用，任何时候都不要动这个对象
             * Method method：当前将要执行的目标对象的方法
             * Object[] args:这个方法调用时时候外界传入参数
             * */
            @Override
            public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                //利用反射执行目标方法
                //目标方法执行后的返回值
                Object result = null;
                try {
                    //System.out.println("["+method.getName()+"]方法开始执行，用的参数是"+ Arrays.asList(args));
                    LogUtils.LogStart(method,args);
                    result = method.invoke(calculator,args);
                    System.out.println("[" + method.getName()+ "]方法执行的结果是" + result);
                }catch (Exception e){
                    System.out.println("[" + method.getName() + "]方法异常了，异常信息是" + e.getCause());
                }finally {
                    System.out.println("[" + method.getName() + "]方法最终结果");
                }
                return result;
            }
        };
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        ClassLoader loader = calculator.getClass().getClassLoader();

        Object proxy = Proxy.newProxyInstance(loader,interfaces,h);
        return  (Calculator) proxy;
    }
}
