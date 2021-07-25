package joydeep.self.learning.spring.refresher.bean.factory;

import joydeep.self.learning.spring.refresher.bean.factory.models.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String args[]) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();
    }
}
