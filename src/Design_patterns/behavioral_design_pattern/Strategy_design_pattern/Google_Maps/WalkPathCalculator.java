package Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps;

import Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps.PathCalculator;

//PathCalculator classes should be singleton as they dont have any other use case
public class WalkPathCalculator implements PathCalculator {
    @Override
    public void findPath(String src, String dest) {
        System.out.println("path via walk from "+ src + " to "+ dest);
    }
}
