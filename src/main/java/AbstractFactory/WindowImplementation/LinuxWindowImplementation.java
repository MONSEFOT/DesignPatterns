package AbstractFactory.WindowImplementation;

public class LinuxWindowImplementation extends WindowImplementation {
    private void LinuxDrawWindow() {
        // the special implementation of drawing rectangles on Linux
    }

    @Override
    public void DeviceRectangle() {
        this.LinuxDrawWindow();
    }
}
