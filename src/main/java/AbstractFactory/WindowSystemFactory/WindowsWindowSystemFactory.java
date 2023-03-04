package AbstractFactory.WindowSystemFactory;

import AbstractFactory.WindowImplementation.WindowImplementation;
import AbstractFactory.WindowImplementation.WindowsWindowImplementation;

public class WindowsWindowSystemFactory extends WindowSystemFactory{
    @Override
    public WindowImplementation createWindowImplementation() {
        return new WindowsWindowImplementation();
    }
}
