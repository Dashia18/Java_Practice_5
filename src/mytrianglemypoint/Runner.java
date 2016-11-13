package mytrianglemypoint;

/**
 * Created by Daria Serebryakova on 13.11.2016.
 */
public class Runner {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(2,4);
        MyPoint point2 = new MyPoint(2,4);
        System.out.println("point1 = " + point1);
        System.out.println("point2 = " + point2);

        System.out.println(point1 == point2);
        System.out.println(point2.equals(point1));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode() + "\n");

        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(2,4);
        MyPoint p3 = new MyPoint(3,5);

        MyTriangle triangle1 = new MyTriangle(p1,p2,p3);
        MyTriangle triangle2 = new MyTriangle(p1,p2,p3);
        System.out.println("triangle1 = " + triangle1);
        System.out.println("triangle2 = " + triangle2);

        System.out.println(triangle1 == triangle2);
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1.hashCode());
        System.out.println(triangle2.hashCode());








    }
}
