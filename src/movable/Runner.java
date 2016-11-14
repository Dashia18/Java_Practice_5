package movable;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class Runner {
    public static void main(String[] args) {


        MovablePoint mpoint = new MovablePoint(1, 2, 3, 4);
        System.out.println("mpoint = " + mpoint);
        mpoint.moveUp();
        mpoint.moveLeft();
        System.out.println("mpoint = " + mpoint);

        MovableCircle mcircle = new MovableCircle(1, 2, 3, 4, 1);
        System.out.println("mcircle = " + mcircle);
        mcircle.moveUp();
        mcircle.moveLeft();
        System.out.println("mcircle = " + mcircle);

    }
}
