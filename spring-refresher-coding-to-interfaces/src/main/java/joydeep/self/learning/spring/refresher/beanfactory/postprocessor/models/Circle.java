package joydeep.self.learning.spring.refresher.beanfactory.postprocessor.models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Circle implements Shape {

    private Point centre;

    @Override
    public void draw() {
        System.out.println("Circle drawn with centre " + centre);
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroying bean " + this);
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Initializing bean " + this + " after setting properties");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + getCentre() +
                '}';
    }

    public Point getCentre() {
        return centre;
    }

    @Required
    @Autowired
    public void setCentre(Point centre) {
        this.centre = centre;
    }
}
