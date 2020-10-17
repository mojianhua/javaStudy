package AOPTest.test;

import AOPTest.impl.MyMathCalculator;
import AOPTest.inter.Calculator;
import AOPTest.proxy.CalculatorProxy;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    private static ApplicationContext ioc3 = new ClassPathXmlApplicationContext("conf/applicationContent3.xml");

    public static void main(String[] args){
//        Calculator calculator = new MyMathCalculator();
////        calculator.add(1,2);
//
//        //jdk的默认的动态代理，如果目标对象没有实现任何借口，是午饭为他创建代理对象的
//        //Spring动态代理难，Spring实现了AOP功能，底层就是动态代理
//        //如果拿到了这个对象的代理对象；代理对象执行加减乘除,动态代理，下面动态代理的参数是放入被代理的方法
//        Calculator proxy = CalculatorProxy.getProxy(calculator);
//        proxy.add(1,2);


//        MyMathCalculator myMathCalculator = new MyMathCalculator();
//        myMathCalculator.add(1,2);


        //AOP的底层是动态代理，容器中保存的组件是他的代理对象
        Calculator bean = ioc3.getBean(Calculator.class);
        bean.add(1,2);
        System.out.println(bean.getClass());

        //没接口就是本类类型
        MyMathCalculator bean2 = ioc3.getBean(MyMathCalculator.class);
        bean2.add(1,2);
        System.out.println(bean.getClass());
    }


}
