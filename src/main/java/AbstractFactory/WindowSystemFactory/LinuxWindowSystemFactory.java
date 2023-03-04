package AbstractFactory.WindowSystemFactory;

import AbstractFactory.WindowImplementation.LinuxWindowImplementation;
import AbstractFactory.WindowImplementation.WindowImplementation;

public class LinuxWindowSystemFactory extends WindowSystemFactory{
    @Override
    public WindowImplementation createWindowImplementation() {
        return new LinuxWindowImplementation();
    }
}
