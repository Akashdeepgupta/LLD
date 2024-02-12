package Design_patterns.behavioral_design_pattern.Strategy_design_pattern.Google_Maps;

//PathCalculator classes should be singleton as they dont have any other use case
public interface PathCalculator {
    void findPath(String src, String dest);
}
