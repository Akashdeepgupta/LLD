package Design_patterns.creational_design_patterns.Factory_design_pattern;

import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.AndroidButton;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.Button;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.AndroidDropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.DropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.AndroidMenu;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.Menu;

public class AndriodFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }


}
