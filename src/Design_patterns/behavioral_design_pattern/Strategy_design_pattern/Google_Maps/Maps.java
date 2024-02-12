package Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps;

public class Maps {
    public void findPath(String src, String dest, Mode mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(src,dest);
    }
}
