package factory_interface;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class SedanCar implements Car{

    SedanCar(){}
    SedanCar(CarType model) {
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
        System.out.println("SEDAN Car build");
    }

    private CarType model;
}

