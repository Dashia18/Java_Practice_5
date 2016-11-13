package ball;

/**
 * Created by Daria Serebryakova on 13.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Ball ball1 = new Ball(4,6,5,6,7);
        Ball ball2 = new Ball(4,6,5,6,7);
        System.out.println("ball1 = " + ball1);
        System.out.println("ball2 = " + ball2);

        System.out.println(ball1 == ball2);
        System.out.println(ball1.equals(ball2));
        System.out.println(ball1.hashCode());
        System.out.println(ball2.hashCode());





    }
}
