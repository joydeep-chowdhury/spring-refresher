package joydeep.self.learning.spring.refresher.bean.postprocessor.models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean, DisposableBean {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean "+this);
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialized bean "+this);
    }
}
