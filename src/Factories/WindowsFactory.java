package Factories;

import Checkbox.CheckboxWindows;
import Interfaces.ICheckbox;

public class WindowsFactory extends AbstraktFactory{
    @Override
    public ICheckbox createCheckBox() {
        return new CheckboxWindows();
    }
}
