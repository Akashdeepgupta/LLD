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

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
