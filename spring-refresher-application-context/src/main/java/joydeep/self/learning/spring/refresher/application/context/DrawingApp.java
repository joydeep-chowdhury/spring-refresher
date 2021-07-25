package joydeep.self.learning.spring.refresher.application.context;

import joydeep.self.learning.spring.refresher.application.context.models.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DrawingApp {

    public static void main(String args[]) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        triangle.draw();
    }
}
