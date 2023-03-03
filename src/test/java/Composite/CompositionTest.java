package Composite;

import Widgets.Character;
import Widgets.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositionTest {
    Composition composition = new Composition();

    @Test
    void insert() {
        this.composition.insert(new Character('F'));
        this.composition.insert(new Rectangle());
        assertEquals(new Rectangle().getClass().getTypeName(), this.composition.child(0).getClass().getTypeName());
    }
}