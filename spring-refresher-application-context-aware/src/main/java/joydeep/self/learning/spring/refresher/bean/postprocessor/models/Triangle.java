package joydeep.self.learning.spring.refresher.bean.postprocessor.models;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private String type;
    private String color;
    private Long height;
    private List<Point> points;
    private ApplicationContext context = null;


    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(String color, Long height) {
        this.color = color;
        this.height = height;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getHeight() {
        return height;
    }

    public void draw() {
        System.out.println(getType() + " triangle drawn of color " + getColor() + " and height " + getHeight() + " cm. and Points " + getPoints());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is "+beanName);
    }
}
