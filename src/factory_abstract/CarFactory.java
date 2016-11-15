package factory_abstract;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class CarFactory {
    public CarFactory(){}

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN: {car = new SedanCar(); break;}
            case WAGON: {car = new WagonCar(); break;}
            case HATCHBACK: {car = new HatchBack();break;}
            default:{
                System.out.println("model is not exist");
                break;
            }
        }

        return car;

    };

}


