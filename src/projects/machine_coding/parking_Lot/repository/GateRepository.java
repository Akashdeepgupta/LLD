package projects.machine_coding.parking_Lot.repository;

import projects.machine_coding.parking_Lot.models.Gate;

import java.util.HashMap;

// assume this like it's a Gate storing table <GateId,Gate>
public class GateRepository {
    HashMap<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate getGate(int gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            //throw
        }
        return gate;
    }

    public void putGate(Gate ticket){
        gateMap.put(ticket.getId(),ticket);
        System.out.println("Gate has been added successfully");
    }
}
