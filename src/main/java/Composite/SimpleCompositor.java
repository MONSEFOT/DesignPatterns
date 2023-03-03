package Composite;

import java.util.ArrayList;

public class SimpleCompositor implements Compositor{
    private Composition composition;

    @Override
    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    @Override
    public void compose() {
        // suppose that the formatting algorithm is the one which reverse the children list
        this.composition.reverseChildren();
    }
}
