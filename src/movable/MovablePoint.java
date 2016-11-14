package movable;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class MovablePoint implements Movable{
    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp(){
        y -= ySpeed;
    };
    public  void moveDown(){
        y += ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public  void moveRight(){
        x += xSpeed;
    }

    //data
    int x;
    int y;
    int xSpeed;
    int ySpeed;
}
