package Design_patterns.creational_design_patterns.Factory_design_pattern;

import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.Button;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.DropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory factory = flutter.createFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();
    }
}
