/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Widgets;

import Core.GlyphObject;

/**
 *
 * @author manssif
 */
public abstract class Character extends GlyphObject {
    private char character;
    
    public Character(char character) {
        this.character = character;
    }
    public char getCharacter() { return this.character; }
}
