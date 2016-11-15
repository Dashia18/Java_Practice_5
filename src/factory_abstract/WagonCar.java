package factory_abstract;

/**
 * Created by Daria Serebryakova on 15.11.2016.
 */
public class WagonCar extends Car {

    WagonCar() {
        super(CarType.WAGON);
        build();
    }
    @Override
    protected void build(){

        System.out.println("Car WAGON build");
    }
}
