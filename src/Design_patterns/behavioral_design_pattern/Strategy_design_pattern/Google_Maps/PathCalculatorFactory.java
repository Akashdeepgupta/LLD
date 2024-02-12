package Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(Mode mode){
        return switch (mode){
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
            default -> null;
        };
    }
}
