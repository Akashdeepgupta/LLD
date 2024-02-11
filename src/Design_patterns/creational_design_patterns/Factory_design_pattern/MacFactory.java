package Design_patterns.creational_design_patterns.Factory_design_pattern;

import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.Button;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.MacButton;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.DropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.MacDropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.MacMenu;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.Menu;

public class MacFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
