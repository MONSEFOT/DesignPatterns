package AbstractFactory.WindowImplementation;

public class MacWindowImplementation extends WindowImplementation {
    private void MacDrawWindow() {
        // the special implementation of drawing rectangles on Mac
    }

    @Override
    public void DeviceRectangle() {
        this.MacDrawWindow();
    }
}
