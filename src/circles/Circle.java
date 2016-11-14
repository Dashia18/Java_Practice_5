package circles;
import static java.lang.Math.*;
/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class Circle implements GeometricObject{
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return  2*PI*radius;
    }


    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    //
    double radius = 1.0;
}
