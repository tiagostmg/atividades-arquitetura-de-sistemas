package Builder;

public interface IVehicleBuilder {
    void setModel();
    void setEngine();
    void setTransmission();
    void setBody();
    void setAccessories();
    Vehicle getVehicle();
}