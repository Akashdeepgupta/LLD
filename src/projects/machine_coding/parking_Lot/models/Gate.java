package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.GateStatus;
import projects.machine_coding.parking_Lot.models.enums.GateType;

public class Gate extends BaseModel{
    int gateNumber; //101 -> 1st floor, gate no -1
    private GateType gateType;
    private GateStatus gateStatus;
    private String operatorName;

    public Gate() {

    }

    public Gate(int gateNumber, GateType gateType, GateStatus gateStatus, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
    }
}
