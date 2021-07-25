package joydeep.self.learning.spring.refresher.application.context.models;

public class Triangle {

    private String type;
    private String color;
    private Long height;

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(String color, Long height) {
        this.color = color;
        this.height = height;
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
        System.out.println(getType() + " triangle drawn of color " + getColor() + " and height " +getHeight()+" cm.");
    }
}
