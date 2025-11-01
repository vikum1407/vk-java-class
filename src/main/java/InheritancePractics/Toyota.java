package InheritancePractics;

public class Toyota extends Vehicle{


    public Toyota(String name, String model, String category, int mileagek) {
        super(name, model, category, mileagek);
    }

    public Toyota(){
        super();
    }

    public void calculate(){
        System.out.println("calculator");
    }

    public void vehicleFunction(String vehicle_name){
        System.out.println("Nooo "+vehicle_name);
        super.brand();
    }

    public void toyotaFunc(){
        System.out.println("Toyota specific features");
        super.brand();
    }


    public static void main(String[] args) {
        Toyota toyota = new Toyota("Toyota", "CRV", "SUV", 220000);
        Toyota toyota1 = new Toyota();
        toyota.vehicleFunction("CHR");
        System.out.println(toyota.mileageCalculation());
        toyota.toyotaFunc();

//        Vehicle vehicle = new Vehicle("Toyota", "CRV", "SUV", 220000);
//        vehicle.vehicleFunction("Hellux");


    }
}
