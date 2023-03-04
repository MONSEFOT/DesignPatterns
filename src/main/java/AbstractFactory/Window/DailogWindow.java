package AbstractFactory.Window;

import AbstractFactory.Window.Window;
import AbstractFactory.WindowImplementation.WindowImplementation;

public class DailogWindow extends Window {
    DailogWindow(int height, int width, WindowImplementation implementation) {
        super(height, width, implementation);
    }
}
