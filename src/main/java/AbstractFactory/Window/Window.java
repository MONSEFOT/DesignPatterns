/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory.Window;

import AbstractFactory.WindowImplementation.WindowImplementation;

public abstract class Window {
    protected WindowImplementation implementation;
    protected int height, width;
    Window(int height, int width, WindowImplementation implementation) {
        this.height = height;
        this.width = width;
        this.implementation = implementation;
    }

    protected void Redraw() {}
    protected void Raise() {}
    protected void Lower() {}
    protected void Iconify() {}
    protected void DeIconify() {}
    protected void DrawLine() {}
    protected void DrawRectangle() {
        this.implementation.DeviceRectangle();
    }
    protected void DrawPolygon() {}
    protected void DrawText() {}
    protected int getHeight() { return this.height; }
    protected int getWidth() { return this.width; }

}
