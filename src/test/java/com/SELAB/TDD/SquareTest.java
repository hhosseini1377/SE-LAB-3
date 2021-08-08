package com.SELAB.TDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SquareTest {
    @Test
    public void negativeSideTest()
    {
        try
        {
            Square square = new Square(-5.32);
            fail("Expected NegativeSideException did not occur.");
            throw new NegativeSideException();
        }
        catch (NegativeSideException e)
        {}

        try {
            Square square = new Square(-2321.214);
            fail("Expected NegativeSideException did not occur.");
            throw new NegativeSideException();
        }
        catch (NegativeSideException e)
        {}

        try {
            Square square = new Square(-0.001);
            fail("Expected NegativeSideException did not occur.");
            throw new NegativeSideException();
        }
        catch (NegativeSideException e)
        {}
    }

    @Test
    public void computeAreaTest() throws NegativeSideException
    {
        double delta = 1e-4;
        Square square1 = new Square(5.32);
        assertEquals(5.32*5.32, square1.computeArea(), delta);

        Square square2 = new Square(1234.1234);
        assertEquals(1234.1234*1234.1234, square2.computeArea(), delta);

        Square square3 = new Square(0.987);
        assertEquals(0.987*0.987, square3.computeArea(), delta);
    }

    @Test
    public void setterAndGetterTest() throws NegativeSideException
    {
        double delta = 1e-4;

        Square square = new Square(4);
        square.setSide(5);
        assertEquals(square.getSide(), 5, delta);

        square.setSide(123.456);
        assertEquals(square.getSide(), 123.456, delta);

        try {
            square.setSide(-11);
            fail("Expected NegativeSideException did not occur.");
        }
        catch (NegativeSideException e) {}
        assertEquals(square.getSide(), 123.456, delta);
    }
}
