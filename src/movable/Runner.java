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

        System.out.println();
        MovableCircle mcircle = new MovableCircle(1, 2, 3, 4, 1);
        System.out.println("mcircle = " + mcircle);
        mcircle.moveUp();
        mcircle.moveLeft();
        System.out.println("mcircle = " + mcircle);


        System.out.println();
        MovableRectangle mrectangle = new MovableRectangle(1, 2, 5, 6, 3, 4);
        System.out.println("mrectangle = " + mrectangle);
        mrectangle.moveUp();
        mrectangle.moveLeft();
        System.out.println("mrectangle = " + mrectangle);

        System.out.println();
        Movable m = new MovablePoint(1,2,3,4);
        System.out.println("m = " + m);
        m.moveUp();
        m.moveLeft();
        System.out.println("m = " + m);

    }
}
