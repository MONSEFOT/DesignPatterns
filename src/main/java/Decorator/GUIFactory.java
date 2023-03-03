package Decorator;

import Widgets.Border;
import Widgets.Character;
import Widgets.Rectangle;
import Widgets.Scroller;

public interface GUIFactory {
    Scroller createScrollBar();
    Border createBorder();
    Rectangle createRectangle();
    Character createCharacter(char character);
}
