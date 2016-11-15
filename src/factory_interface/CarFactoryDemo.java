package factory_interface;

/**
 * Created by Daria Serebryakova on 14.11.2016.
 */
public class CarFactoryDemo {
    public static void main(String[] args) {

        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.WAGON));
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
    }
}
