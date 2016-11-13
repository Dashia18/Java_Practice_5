package ball;
/**
 * Created by dbobkova on 24.10.2016.
 */
public class Ball {
    //Methods
    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (Math.cos(direction) * speed);
        this.yDelta = (float) (Math.sin(direction) * (-speed));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void  move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "(" + x +
                ", " + y +
                "), speed = (" + xDelta +
                ", " + yDelta +
                ")}";
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == this){return  true;}
        if( !(obj instanceof  Ball)){return false;}
        Ball ball = (Ball)obj;
        return (this.x == ball.x) && (this.y == ball.y)&&(this.radius == ball.radius)
                &&(this.xDelta == ball.xDelta)&&(this.yDelta == ball.yDelta);
    }

    @Override
    public int hashCode() {
        int hashResult = 17;
        hashResult = hashResult * 31 + (int)x;
        hashResult = hashResult * 31 + (int)y;
        hashResult = hashResult * 31 + radius;
        hashResult = hashResult * 31 + (int)xDelta;
        hashResult = hashResult * 31 + (int)yDelta;
        return hashResult;

    }

    //Data
    private float x; //coordinate of centre
    private float y; //coordinate of centre
    private int radius;
    private float xDelta;
    private float yDelta;
}