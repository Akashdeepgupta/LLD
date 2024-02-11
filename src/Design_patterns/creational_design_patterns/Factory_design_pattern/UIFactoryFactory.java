package Design_patterns.creational_design_patterns.Factory_design_pattern;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case IOS : return new IosFactory();
            case ANDROID: return new AndriodFactory();
            case MAC: return new MacFactory();
        }
        return null;
    }
}
