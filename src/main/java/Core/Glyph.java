/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Widgets.Rectangle;
public abstract class Glyph {   
    abstract protected void setProperty(GlyphPropeties property, double value);
    abstract protected double getProperty(GlyphPropeties property);
    abstract protected void insert(Glyph child);
    abstract protected void remove(int index);
    abstract protected void setParent(Glyph parent);
    abstract protected Glyph child(int index);
    abstract protected Glyph parent();
    abstract  protected void reverseChildren();
    abstract protected void Draw(Window window);
    abstract protected Rectangle Bounds();
    abstract protected boolean Intersects(Point point);
}
