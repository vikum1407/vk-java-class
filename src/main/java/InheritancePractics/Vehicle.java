package InheritancePractics;

public class Vehicle {

    private String vehicle_name;
    private String vehicle_model;
    private String vehicle_category;
    private static int mileage;


    public Vehicle(String name, String model, String category, int mileagek){
        vehicle_name = name;
        vehicle_model = model;
        vehicle_category = category;
        mileage = mileagek;
    }

    public Vehicle(){
        System.out.println("Vehicle Constractor");
    }

    public void vehicleFunction(String vehicle_name){
        System.out.println("Wow "+vehicle_name);
    }

    public static void brand(){
        System.out.println("vehicle brancs");
    }


    public static double mileageCalculation(){

        double cal=0;

        cal = mileage *20/100;

        return cal;
    }
}
