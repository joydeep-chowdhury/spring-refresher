package joydeep.self.learning.spring.refresher.beanfactory.postprocessor;

import joydeep.self.learning.spring.refresher.beanfactory.postprocessor.models.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String args[]) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.registerShutdownHook();
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        triangle.draw();
    }
}
