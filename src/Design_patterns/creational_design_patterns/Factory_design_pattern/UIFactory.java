package Design_patterns.creational_design_patterns.Factory_design_pattern;

import Design_patterns.creational_design_patterns.Factory_design_pattern.component.button.Button;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.dropdown.DropDown;
import Design_patterns.creational_design_patterns.Factory_design_pattern.component.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
