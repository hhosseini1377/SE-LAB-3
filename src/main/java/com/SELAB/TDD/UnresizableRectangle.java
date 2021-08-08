package com.SELAB.TDD;

public class UnresizableRectangle {
    protected double width, height;
    public UnresizableRectangle(double width, double height) throws NegativeSideException {
        if (width < 0 || height < 0)
            throw new NegativeSideException();

        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return this.width * this.height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
