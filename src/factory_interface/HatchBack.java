package factory_interface;

/**
 * Created by Daria Serebryakova on 15.11.2016.
 */
public class HatchBack implements Car{

    HatchBack() {}
    HatchBack(CarType model) {
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

        System.out.println("HATCHBACK Car build");
    }

    private CarType model;
}
