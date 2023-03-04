package AbstractFactory.Window;

import AbstractFactory.Window.Window;
import AbstractFactory.WindowImplementation.WindowImplementation;

public class IconWindow extends Window {
    IconWindow(int height, int width, WindowImplementation implementation) {
        super(height, width, implementation);
    }
}
