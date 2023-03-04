package Composite;

import Core.Glyph;
import Core.GlyphObject;

public class Composition extends GlyphObject {
    private final SimpleCompositor compositor;

    Composition() {
        this.compositor = new SimpleCompositor();
        this.compositor.setComposition(this);
    }

    @Override
    public void insert(Glyph child) {
        super.insert(child);
        this.compositor.compose();
    }

}
