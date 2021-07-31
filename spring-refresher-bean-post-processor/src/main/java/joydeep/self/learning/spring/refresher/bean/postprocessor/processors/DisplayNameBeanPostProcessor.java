package joydeep.self.learning.spring.refresher.bean.postprocessor.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean post processor before initialization Object type "+bean.getClass().getSimpleName()+" Bean Name "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean post processor after initialization Object type "+bean.getClass().getSimpleName()+" Bean Name "+beanName);
        return bean;
    }
}
