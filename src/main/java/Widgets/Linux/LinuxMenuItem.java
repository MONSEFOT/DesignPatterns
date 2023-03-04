package Widgets.Linux;

import Bridge.Command;
import Widgets.MenuItem;

public class LinuxMenuItem extends MenuItem {
    public LinuxMenuItem(Command command) {
        super(command);
    }

    @Override
    public void onClick() {
        super.onClick();
        System.out.println("Linux MenuItem is Clicked !!");
    }
}
