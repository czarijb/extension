package com.javaExtention;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 * Created by 1 on 10-Dec-16.
 */
public class MyMathTest extends TestCase{
    private MyMath mm = new MyMath();


    public void testMathSqrt(){
        assertTrue(mm.mathSqrt(81) == 9.0);
    }
}
