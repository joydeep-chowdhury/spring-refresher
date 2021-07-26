package joydeep.self.learning.spring.refresher.application.context.models;

public class Triangle {

    private String type;
    private String color;
    private Long height;
    private Point point1;
    private Point point2;
    private Point point3;


    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(String color, Long height) {
        this.color = color;
        this.height = height;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
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
        System.out.println(getType() + " triangle drawn of color " + getColor() + " and height " +getHeight()+" cm. and Points point1: "+getPoint1()+" point2: "+getPoint2()+" point3: "+getPoint3());
    }
}
