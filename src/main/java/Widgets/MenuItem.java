package Widgets;

import Bridge.Command;
import Core.GlyphObject;

public abstract class MenuItem extends GlyphObject {
    protected final Command command;

    protected MenuItem(Command command) {
        this.command = command;
    }
    protected void onClick() {
        this.command.Execute();
    }
}
