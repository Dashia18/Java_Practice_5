package circles;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println("circle1 = " + circle1);
        System.out.println("Perimeter = "+circle1.getPerimeter() +" \nArea = "+ circle1.getArea());
        System.out.println();

        ResizableCircle rcircle = new ResizableCircle(5);
        System.out.println("rcircle = " + rcircle);
        rcircle.resize(25);//25%
        System.out.println("rcircle = " + rcircle);
        System.out.println("Perimeter = "+rcircle.getPerimeter() +" \nArea = "+ rcircle.getArea());
    }
}
