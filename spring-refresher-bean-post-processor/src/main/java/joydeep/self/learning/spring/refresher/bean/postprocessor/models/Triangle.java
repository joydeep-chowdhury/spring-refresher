package joydeep.self.learning.spring.refresher.bean.postprocessor.models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean {

    private String type;
    private String color;
    private Long height;
    private List<Point> points;


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
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", points=" + points +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Bean "+this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
       System.out.println("Initialized Bean "+this);
    }
}
