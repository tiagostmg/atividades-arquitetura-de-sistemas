package Builder;

public class Main {
    public static void main(String[] args) {
        VehicleCreator vehicleCreator = new VehicleCreator(new FerrariBuilder());
        vehicleCreator.createVehicle();
        Vehicle vehicle = vehicleCreator.getVehicle();
        vehicle.showInfo();

        System.out.println("---------------------------------------------");

        vehicleCreator = new VehicleCreator(new HondaBuilder());
        vehicleCreator.createVehicle();
        vehicle = vehicleCreator.getVehicle();
        vehicle.showInfo();
    }
}