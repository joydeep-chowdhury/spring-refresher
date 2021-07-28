package joydeep.self.learning.spring.refresher.lifecycle.callbacks;

import joydeep.self.learning.spring.refresher.lifecycle.callbacks.models.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String args[]) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        triangle.draw();
    }
}
