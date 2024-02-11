package Design_patterns.creational_design_patterns.Factory_design_pattern;

import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.Button;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.IosButton;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.DropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.IosDropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.IosMenu;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.Menu;

public class IosFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
