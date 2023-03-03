package Widgets;

import Core.Glyph;
import Core.MonoGlyph;
import Core.Window;

public abstract class Border extends MonoGlyph {
    @Override
    public void insert(Glyph child) {
        // the border should compose not more than one glyph
        if (this.children.size() > 0) return;
        super.insert(child);
    }
    private void DrawBorder(Window window) {

    }
    @Override
    public void Draw(Window window) {
        super.Draw(window);
        this.DrawBorder(window);
    }
}
