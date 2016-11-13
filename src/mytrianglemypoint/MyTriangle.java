package mytrianglemypoint;

import java.util.Objects;

/**
 * Created by Daria Serebryakova on 13.10.2016.
 */
public class MyTriangle {
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        double perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);//P = a + b + c
        return perimeter;
    }

    public String getType() {
        String type = "0";//Equilateral, Isosceles, Scalene
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        if ((a == b) && (b == c)) {
            type = "Equilateral";
        } else if ((a == b) || (b == c)) {
            type = "Isosceles";
        } else {
            type = "Scalene";
        }

        return type;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) {return  true;}
        if (!(obj instanceof MyTriangle)){return  false;}

        MyTriangle myTriangle = (MyTriangle) obj;
        return (this.v1 == myTriangle.v1)&&(this.v2 == myTriangle.v2)&&(this.v3 == myTriangle.v3);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + v1.hashCode();
        result = result * 31 + v2.hashCode();
        result = result * 31 + v3.hashCode();
        return result;
    }

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
}
