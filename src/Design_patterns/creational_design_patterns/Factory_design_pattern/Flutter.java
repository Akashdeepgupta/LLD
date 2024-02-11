package Design_patterns.creational_design_patterns.Factory_design_pattern;

import static Design_patterns.creational_design_patterns.Factory_design_pattern.SupportedPlatform.IOS;

public class Flutter {

    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatforms) {
        this.supportedPlatform = supportedPlatforms;
    }

    public void setTheme(){
        System.out.println("Theme is being set");
    }
    public void setRefreshRate(){
        System.out.println("refresh rate is being set");
    }
    public UIFactory createFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
