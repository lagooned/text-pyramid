
package com.jaredengler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        var text = textPyramid.generate(0, "-");
        assertEquals(">", text);
    }

    @Test
    public void testOneHeight() {
        assertEquals("->", textPyramid.generate(1, "-"));
    }

    @Test
    public void testTwoHeight() {
        assertEquals("-\n-->\n-", textPyramid.generate(2, "-"));
    }

    @Test
    public void testThreeHeight() {
        assertEquals("-\n--\n--->\n--\n-", textPyramid.generate(3, "-"));
    }

    @Test
    public void testNHeight() {

        for (int i = 4; i < 100; i++) {

            String pyramidString = textPyramid.generate(i, "-");
            assertTrue(pyramidString.contains("-".repeat(i).concat(">")));

            int lowerBound = i * i / 2;
            int upperBound = 2 * (lowerBound + i);
            int pyramidStringLength = pyramidString.length();
            boolean lowerBoundCheck = pyramidStringLength >= lowerBound;
            Boolean upperBoundCheck = upperBound >= pyramidStringLength;

            assertTrue(lowerBoundCheck);
            assertTrue(upperBoundCheck);

        }

    }

}
