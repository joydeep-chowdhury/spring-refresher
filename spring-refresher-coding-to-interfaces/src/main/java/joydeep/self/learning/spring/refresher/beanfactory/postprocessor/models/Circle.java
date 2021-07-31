package joydeep.self.learning.spring.refresher.beanfactory.postprocessor.models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements Shape, InitializingBean, DisposableBean {

    private Point centre;

    @Override
    public void draw() {
        System.out.println("Circle drawn with centre " + centre);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean " + this + " after setting properties");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre +
                '}';
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }
}
