package Factories;

import Checkbox.CheckboxiOS;
import Interfaces.ICheckbox;

public class iOSFactory extends AbstraktFactory{
    @Override
    public ICheckbox createCheckBox() {
        return new CheckboxiOS();

    }
}
