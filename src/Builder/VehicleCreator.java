package Builder;
public class VehicleCreator {
    private final IVehicleBuilder objBuilder;

    public VehicleCreator(IVehicleBuilder builder) {
        this.objBuilder = builder;
    }

    public void createVehicle() {
        objBuilder.setModel();
        objBuilder.setEngine();
        objBuilder.setBody();
        objBuilder.setTransmission();
        objBuilder.setAccessories();
    }

    public Vehicle getVehicle() {
        return objBuilder.getVehicle();
    }
}