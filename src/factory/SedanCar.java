package factory;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class SedanCar extends Car{

    SedanCar() {
        super(CarType.SEDAN);
        build();
    }
    @Override
    protected void build(){

        System.out.println("Car SEDAN build");
    }


}

