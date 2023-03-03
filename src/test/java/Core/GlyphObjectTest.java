package Core;

import Widgets.Character;
import Widgets.Rectangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GlyphObjectTest {
    GlyphObject object = new GlyphObject();

    @Test
    void getProperty() {
        this.object.setProperty(GlyphPropeties.X, 20);
        this.object.setProperty(GlyphPropeties.Y, 203);
        assertEquals(20, this.object.getProperty(GlyphPropeties.X));
        assertEquals(203, this.object.getProperty(GlyphPropeties.Y));
    }

    @Test
    void insert() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            this.object.child(0);
        });
        assertEquals(IndexOutOfBoundsException.class.getTypeName(), exception.getClass().getTypeName());
        this.object.insert(new Rectangle());
        assertNotNull(this.object.child(0));
    }

    @Test
    void remove() {
        this.object.insert(new Rectangle());
        assertNotNull(this.object.child(0));
        this.object.remove(0);
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            this.object.child(0);
        });
        assertEquals(IndexOutOfBoundsException.class.getTypeName(), exception.getClass().getTypeName());
    }

    @Test
    void parent() {
        this.object.insert(new Rectangle());
        assertEquals(this.object, this.object.child(0).parent());
    }

    @Test
    void reverseChildren() {
        this.object.insert(new Rectangle());
        this.object.insert(new Character('E'));
        this.object.insert(new Character('A'));
        this.object.reverseChildren();
        assertEquals(new Character('A').getClass().getTypeName(), this.object.child(0).getClass().getTypeName());
    }
}