import Factories.AbstraktFactory;
import Factories.WindowsFactory;
import Factories.iOSFactory;
import Interfaces.ICheckbox;

import java.util.Scanner;

public class FabricDemo {
    public static void main(String[] args) {
        System.out.println("What type of Checkbox are you nead? (i - iOS, w - Windows)");
        Scanner scanner = new Scanner(System.in);
        String userChoise = scanner.nextLine();
        AbstraktFactory factory;
        switch (userChoise){
            case "i" : factory = new iOSFactory();
            break;
            case  "w" : factory = new WindowsFactory();
            break;
            default :
                System.out.println("Your choise is incorrect");
                factory=null;
        }
        if (factory != null){
            createCheckBox(factory).paint();

        }

    }
    public static ICheckbox createCheckBox (AbstraktFactory factory){
        return factory.createCheckBox();
    }
}
