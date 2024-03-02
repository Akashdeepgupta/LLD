package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.ParkingLotStatus;
import projects.machine_coding.parking_Lot.models.enums.VehicleType;
import projects.machine_coding.parking_Lot.service.BillCalculatorStrategy.BillCalculatorStrategy;
import projects.machine_coding.parking_Lot.service.spot_allocation_strategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private int capacity;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> vehicleTypesSupported;
    private ParkingLotStatus parkingLotStatus;
    private SpotAllocationStrategy spotAllocationStrategy;
    private BillCalculatorStrategy billCalculatorStrategy;

    public ParkingLot() {
    }

    public ParkingLot(String name, String address, int capacity, List<ParkingFloor> parkingFloors, List<VehicleType> vehicleTypesSupported, ParkingLotStatus parkingLotStatus, SpotAllocationStrategy spotAllocationStrategy, BillCalculatorStrategy billCalculatorStrategy) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.parkingFloors = parkingFloors;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.parkingLotStatus = parkingLotStatus;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.billCalculatorStrategy = billCalculatorStrategy;
    }
}
