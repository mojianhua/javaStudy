package AOPTest.impl;

import AOPTest.inter.Calculator;
import org.springframework.stereotype.Service;

@Service
public class MyMathCalculator implements Calculator {

    @Override
    public int add(int i,int j){
        //LogUtils.LogStart(i,j);
        int result = i + j;
        System.out.println("[add 方法开始了，它是【 " + i + "+" + j + "=" + result);
        return result;
    }

    @Override
    public int sub(int i,int j){
        //LogUtils.LogStart(i,j);
        int result = i - j;
        System.out.println("[sub 方法开始了，它是【 " + i + "-" + j + "=" + result);
        return result;
    }

    @Override
    public int mul(int i,int j){
        //LogUtils.LogStart(i,j);
        int result = i * j;
        System.out.println("[mul 方法开始了，它是【 " + i + "*" + j + "=" + result);
        return result;
    }

    @Override
    public int div(int i,int j){
        //LogUtils.LogStart(i,j);
        int result = i / j;
        System.out.println("[div 方法开始了，它是【 " + i + "/" + j + "=" + result);
        return result;
    }

}
