/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import AbstractFactory.Window.Window;
import Widgets.Rectangle;
import java.util.ArrayList;

public class GlyphObject extends Glyph{
    protected double x, y, width, height;
    protected Glyph parent;
    protected ArrayList<Glyph> children;
    
    public GlyphObject() {
        this.children = new ArrayList<>();
    }

    @Override
    public void setProperty(GlyphProperties property, double value) {
        switch (property) {
            case X:
                this.x = value;
                break;
            case Y:
                this.y = value;
                break;
            case WIDTH:
                this.width = value;
                break;
            case HEIGHT:
                this.height = value;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public double getProperty(GlyphProperties property) {
        if (property == GlyphProperties.X) return this.x;
        if(property == GlyphProperties.Y) return this.y;
        if(property == GlyphProperties.WIDTH) return this.width;
        return this.height;
    }
    
    @Override
    public void insert(Glyph child) {
        child.setParent(this);
        this.children.add(child);
    }

    @Override
    public void remove(int index) {
        this.children.remove(index);
    }

    @Override
    public Glyph child(int index)  { return this.children.get(index); }

    @Override
    public Glyph parent() {
        return this.parent;
    }

    @Override
    public void reverseChildren() {
        for(int index = 0; index < this.children.size() / 2; index++) {
            Glyph object  = this.children.get(index);
            this.children.set(index, this.children.get(this.children.size() - 1 - index));
            this.children.set(this.children.size() - 1 - index, object);
        }
    }

    @Override
    public void setParent(Glyph parent) {
        this.parent = parent;
    }

    @Override
    public void Draw(Window window) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Rectangle Bounds() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Intersects(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
