
package com.jaredengler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

    TextPyramid textPyramid;

    @Before
    public void setup() {
        textPyramid = new TextPyramid();
    }

    @Test
    public void testZeroHeight() {
        assertEquals("", textPyramid.generate(0));
    }

}
