package projects.machine_coding.parking_Lot.models;

public class CarParkingDetails {
    ParkingFloor parkingFloor;
    ParkingSpot parkingSpot;

    public CarParkingDetails() {
    }

    public CarParkingDetails(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        this.parkingFloor = parkingFloor;
        this.parkingSpot = parkingSpot;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
