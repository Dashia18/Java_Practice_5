package factory;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public interface Car {
    //public Car(CarType model){ }
    public void build();
    public CarType getModel();
    public void setModel(CarType model);



}
