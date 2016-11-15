package factory;

/**
 * Created by Daria Serebryakova on 15.11.2016.
 */
public class HatchBack extends Car{
    HatchBack() {
        super(CarType.HATCHBACK);
        build();
    }
    @Override
    protected void build(){

        System.out.println("Car HATCHBACK build");
    }
}
