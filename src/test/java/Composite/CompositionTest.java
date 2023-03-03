package Composite;

import Decorator.GUIFactory;
import Decorator.LinuxFactory;
import Decorator.WindowsFactory;
import Widgets.Character;
import Widgets.Rectangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositionTest {
    Composition composition = new Composition();
    GUIFactory factory;
    CompositionTest() {
        factory = new WindowsFactory();
    }
    @Test
    void insert() {
        this.composition.insert(factory.createCharacter('F'));
        this.composition.insert(factory.createRectangle());
        assertEquals(factory.createRectangle().getClass().getTypeName(), this.composition.child(0).getClass().getTypeName());
    }
}