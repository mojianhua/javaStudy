package AOPTest.test;

import AOPTest.impl.MyMathCalculator;
import AOPTest.inter.Calculator;
import AOPTest.proxy.CalculatorProxy;

public class AOPTest {
    public static void main(String[] args){
        Calculator calculator = new MyMathCalculator();
//        calculator.add(1,2);

        //jdk的默认的动态代理，如果目标对象没有实现任何借口，是午饭为他创建代理对象的
        //Spring动态代理难，Spring实现了AOP功能，底层就是动态代理
        //如果拿到了这个对象的代理对象；代理对象执行加减乘除,动态代理，下面动态代理的参数是放入被代理的方法
        Calculator proxy = CalculatorProxy.getProxy(calculator);
        proxy.add(1,2);
    }
}
