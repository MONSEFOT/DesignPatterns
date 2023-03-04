package AbstractFactory.WindowSystemFactory;

import AbstractFactory.WindowImplementation.MacWindowImplementation;

public class MacWindowSystemFactory extends WindowSystemFactory{
    @Override
    public MacWindowImplementation createWindowImplementation() {
        return new MacWindowImplementation();
    }
}
