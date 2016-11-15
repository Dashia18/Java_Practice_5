package factory_interface;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class CarFactory {
    public CarFactory(){}

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN: {car = new SedanCar(CarType.SEDAN); break;}
            case WAGON: {car = new WagonCar(CarType.WAGON); break;}
            case HATCHBACK: {car = new HatchBack(CarType.HATCHBACK);break;}
            default:{System.out.println("model is not exist"); break;}
        }
        return  car;
    }
}


