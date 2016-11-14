package circles;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent){
        double newRadius = radius + (radius*percent)/100;
        super.radius = newRadius;
    }
}
