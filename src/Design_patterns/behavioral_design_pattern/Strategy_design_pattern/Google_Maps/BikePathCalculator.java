package Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps;

//PathCalculator classes should be singleton as they dont have any other use case
public class BikePathCalculator implements PathCalculator {
    @Override
    public void findPath(String src, String dest) {
        System.out.println("path via bike from "+ src + " to "+ dest);
    }
}
