package Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps;

public class Main {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.findPath("bombay","goa", Mode.BIKE);
    }
}
