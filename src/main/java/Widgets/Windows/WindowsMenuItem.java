package Widgets.Windows;

import Bridge.Command;
import Widgets.MenuItem;

public class WindowsMenuItem extends MenuItem {
    public WindowsMenuItem(Command command) {
        super(command);
    }

    @Override
    public void onClick() {
        super.onClick();
        System.out.println("Windows MenuItem is Clicked !!");
    }
}
