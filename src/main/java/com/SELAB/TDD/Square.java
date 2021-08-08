package com.SELAB.TDD;

public class Square extends UnresizableRectangle {
    public Square(double side) throws NegativeSideException {
        super(side, side);
    }

    public void setSide(double side) throws NegativeSideException {
        if (side < 0) {
            throw new NegativeSideException();
        }
        super.height = side;
        super.width = side;
    }

    public double getSide() {
        return super.getHeight();
    }
}
