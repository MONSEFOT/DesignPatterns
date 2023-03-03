package org.monserfot;

import Decorator.GUIFactory;
import Decorator.LinuxFactory;
import Decorator.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        if (args[0] == "linux") factory = new LinuxFactory();
        else factory = new WindowsFactory();
        System.out.println(factory.createCharacter('A').getClass().getTypeName());
    }
}