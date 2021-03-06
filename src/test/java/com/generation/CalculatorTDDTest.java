package com.generation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTDDTest {

    CalculatorTDD calculatorTDD = new CalculatorTDD();

    @Test
    public void addTest()
    {
        assertEquals( 0, calculatorTDD.addNumbers( 5, 3 ) );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 0, calculatorTDD.subtractNumbers( 10, 5 ) );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 0, calculatorTDD.multiplyNumbers( 5, 3 ) );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 0, calculatorTDD.divideNumbers( 5, 0 ) );
    }

}
