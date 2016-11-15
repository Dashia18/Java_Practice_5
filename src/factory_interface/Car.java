package factory_interface;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public interface Car {

    public void build();
    public CarType getModel();
    public void setModel(CarType model);
}
