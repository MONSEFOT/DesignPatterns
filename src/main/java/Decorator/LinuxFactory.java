package Decorator;

import Widgets.Border;
import Widgets.Character;
import Widgets.Linux.LinuxBorder;
import Widgets.Linux.LinuxCharacter;
import Widgets.Linux.LinuxRectangle;
import Widgets.Linux.LinuxScroller;
import Widgets.Rectangle;
import Widgets.Scroller;

public class LinuxFactory implements GUIFactory{

    @Override
    public Scroller createScrollBar() {
        return new LinuxScroller();
    }

    @Override
    public Border createBorder() {
        return new LinuxBorder();
    }

    @Override
    public Rectangle createRectangle() {
        return new LinuxRectangle();
    }

    @Override
    public Character createCharacter(char character) {
        return new LinuxCharacter(character);
    }
}
