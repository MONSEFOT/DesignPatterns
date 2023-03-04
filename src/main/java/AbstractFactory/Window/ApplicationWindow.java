package AbstractFactory.Window;

import AbstractFactory.Window.Window;
import AbstractFactory.WindowImplementation.WindowImplementation;

public class ApplicationWindow extends Window {
    ApplicationWindow(int height, int width, WindowImplementation implementation) {
        super(height, width, implementation);
    }
}
