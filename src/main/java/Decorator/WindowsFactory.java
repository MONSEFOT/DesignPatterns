package Decorator;

import Widgets.Border;
import Widgets.Character;
import Widgets.Rectangle;
import Widgets.Scroller;
import Widgets.Windows.WindowsBorder;
import Widgets.Windows.WindowsCharacter;
import Widgets.Windows.WindowsRectangle;
import Widgets.Windows.WindowsScroller;

public class WindowsFactory implements GUIFactory {

    @Override
    public Scroller createScrollBar() {
        return new WindowsScroller();
    }

    @Override
    public Border createBorder() {
        return new WindowsBorder();
    }

    @Override
    public Rectangle createRectangle() {
        return new WindowsRectangle();
    }

    @Override
    public Character createCharacter(char character) {
        return new WindowsCharacter(character);
    }
}
