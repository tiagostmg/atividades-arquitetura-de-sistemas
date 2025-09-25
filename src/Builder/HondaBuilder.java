package Builder;

public class HondaBuilder implements IVehicleBuilder {
    private Vehicle objVehicle = new Vehicle();

    @Override
    public void setModel() {
        objVehicle.model = "Honda";
    }

    @Override
    public void setEngine() {
        objVehicle.engine = "4 Stroke";
    }

    @Override
    public void setTransmission() {
        objVehicle.transmission = "125 Km/hr";
    }

    @Override
    public void setBody() {
        objVehicle.body = "Plastic";
    }

    @Override
    public void setAccessories() {
        objVehicle.accessories.add("Seat Cover");
        objVehicle.accessories.add("Rear Mirror");
        objVehicle.accessories.add("Helmet");
    }

    @Override
    public Vehicle getVehicle() {
        return objVehicle;
    }
}