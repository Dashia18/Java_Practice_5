package movable;

import static java.lang.Math.*;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class MovableCircle implements Movable{
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {

        center.y -= center.ySpeed;
    }



    @Override
    public void moveDown() {

        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {

        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
    //data
    private int radius;
    private MovablePoint center;
}
