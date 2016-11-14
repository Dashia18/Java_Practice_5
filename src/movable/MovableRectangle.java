package movable;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class MovableRectangle implements Movable {

    public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint( x1, y1, xSpeed, ySpeed);
        this.bottomRirht = new MovablePoint( x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRirht=" + bottomRirht +
                '}';
    }


    public void moveUp(){

        topLeft.y -= topLeft.ySpeed;
        bottomRirht.y -= bottomRirht.ySpeed;
    }
    public  void moveDown(){

        topLeft.y += topLeft.ySpeed;
        bottomRirht.y += bottomRirht.ySpeed;
    }
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
        bottomRirht.x -= bottomRirht.xSpeed;
    }
    public  void moveRight(){
        topLeft.x += topLeft.xSpeed;
        bottomRirht.x += bottomRirht.xSpeed;
    }


    //
    private MovablePoint topLeft ;
    private MovablePoint bottomRirht;
}
