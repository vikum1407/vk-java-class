package InheritancePractics;

public class LandRover {

    int count;
    static String brand;

    public void calculate(){
        System.out.println("calculator");
        vehicleFunction("Freelander");
        System.out.println(brand);
        System.out.println(count);
    }

    public static void vehicleFunction(String vehicle_name){
        System.out.println("Nooo "+vehicle_name);
        LandRover landRover = new LandRover();
        landRover.calculate();
        System.out.println(landRover.count);
        System.out.println(brand);
    }

    public static void main(String[] args) {

    }

}
