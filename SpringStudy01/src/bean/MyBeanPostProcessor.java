package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * bean初始化前调用
     * */
    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException{
        System.out.println("【"+ beanName +"】bean将要调用初始化方法....这个bean是这样【" + bean + "】");
        return bean;
    }

    /**
     * bean初始化后调用
     * Object bean,
     * String beanName：bean在xml中配置的id
     * */
    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
        System.out.println("【"+ beanName +"】bean初始化方法调用完.........");
        return bean;
    }
}
