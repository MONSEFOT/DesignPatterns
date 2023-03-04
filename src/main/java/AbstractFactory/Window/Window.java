/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory.Window;

import AbstractFactory.WindowImplementation.WindowImplementation;
import AbstractFactory.WindowSystemFactory.WindowSystemFactory;
import AbstractFactory.WindowSystemFactory.WindowsWindowSystemFactory;

public abstract class Window {
    protected WindowImplementation implementation;
    protected WindowSystemFactory windowSystemFactory;
    protected int height, width;
    Window(int height, int width, WindowSystemFactory windowSystemFactory) {
        this.windowSystemFactory = windowSystemFactory;
        this.implementation = this.windowSystemFactory.createWindowImplementation();
        this.height = height;
        this.width = width;
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
