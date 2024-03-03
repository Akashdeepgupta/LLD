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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public BillCalculatorStrategy getBillCalculatorStrategy() {
        return billCalculatorStrategy;
    }

    public void setBillCalculatorStrategy(BillCalculatorStrategy billCalculatorStrategy) {
        this.billCalculatorStrategy = billCalculatorStrategy;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", parkingFloors=" + parkingFloors +
                ", vehicleTypesSupported=" + vehicleTypesSupported +
                ", parkingLotStatus=" + parkingLotStatus +
                ", spotAllocationStrategy=" + spotAllocationStrategy +
                ", billCalculatorStrategy=" + billCalculatorStrategy +
                '}';
    }
}
