package projects.machine_coding.parking_Lot.service.spot_allocation_strategy;

import projects.machine_coding.parking_Lot.exceptions.InvalidSpotAllocationStrategy;

public class SpotAllocationFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(SpotAllocationStrategyName spotAllocationStrategyName){
        switch (spotAllocationStrategyName){
            case LINEARSPOTALLOCATIONSTRATEGY -> {
                return new LinearSpotAllocationStrategy();
            }
            case SMARTSPOTALLOCATIONSTRATEGY -> {
                return new SmartSpotAllocationStrategy();
            }
            default -> {
                throw new InvalidSpotAllocationStrategy();
            }
        }
    }
}
