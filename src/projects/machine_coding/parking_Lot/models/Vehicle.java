package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.VehicleType;

public class Vehicle extends BaseModel{
    private int vehicleNumber;
    private VehicleType vehicleType;
    private String color;

    public Vehicle() {
    }

    public Vehicle( int vehicleNumber, VehicleType vehicleType, String color) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.color = color;
    }
}
