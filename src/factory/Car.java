package factory;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public abstract class Car {

    public Car(){}
    public Car(CarType model){ }

    protected abstract void build();

    public CarType getModel(){ return model;}
    public void setModel(CarType model){ this.model = model;}

    //
    private CarType model;


}
