package joydeep.self.learning.spring.refresher.beanfactory.postprocessor;

import joydeep.self.learning.spring.refresher.beanfactory.postprocessor.models.Circle;
import joydeep.self.learning.spring.refresher.beanfactory.postprocessor.models.Shape;
import joydeep.self.learning.spring.refresher.beanfactory.postprocessor.models.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String args[]) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.registerShutdownHook();
        Shape triangleShape= (Triangle) applicationContext.getBean("triangle");
        triangleShape.draw();
        Shape circleShape= (Circle) applicationContext.getBean("circle");
        circleShape.draw();
    }
}
