package factory_interface;

/**
 * Created by Daria Serebryakova on 15.11.2016.
 */
public class WagonCar implements Car {

    WagonCar() {}
    WagonCar(CarType model) {
        this.model = model;
        build();
    }

    @Override
    public CarType getModel(){
        return this.model;
    }
    @Override
    public void setModel(CarType model)
    {
        this.model = model;
    }
    @Override
    public void build(){
        System.out.println("WAGON Car build");
    }

    private CarType model;
}
