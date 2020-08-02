package com.jaredengler;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextPyramid {

    String generate(Integer height, String c) {
        return IntStream.iterate(-height, i -> i + 1).boxed().limit(2 * height + 1).map(n -> {
            if (n > 0)
                return -n;
            return n;
        }).map(n -> n + height).map(n -> {
            if (n == height)
                return c.repeat(n).concat(">");
            return c.repeat(n);
        }).collect(Collectors.joining("\n")).trim();
    }

}
