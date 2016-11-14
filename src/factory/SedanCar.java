package factory;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class SedanCar implements Car{

    private SedanCar() {

    }
    @Override
    public void build(){

        System.out.println("Car SEDAN build");
    }
    public CarType getModel(){
        System.out.println("CarType is SEDAN");
        return CarType.SEDAN;
    }
    public void setModel(CarType model){

    }

}

