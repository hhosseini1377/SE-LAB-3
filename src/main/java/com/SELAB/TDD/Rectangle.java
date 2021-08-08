package com.SELAB.TDD;

public class Rectangle extends UnresizableRectangle {
    public Rectangle(double width, double height) throws NegativeSideException {
        super(width, height);
    }
    
    public void setHeight(double height) throws NegativeSideException {
        if (height < 0) {
            throw new NegativeSideException();
        }
        super.height = height;
    }

    public void setWidth(double width) throws NegativeSideException {
        if (width < 0) {
            throw new NegativeSideException();
        }
        super.width = width;
    }
}
