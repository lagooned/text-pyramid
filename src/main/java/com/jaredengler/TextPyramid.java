package com.jaredengler;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextPyramid {

    String generate(Integer height, String pyramidCharacter) {
        return IntStream.iterate(-height, i -> i + 1).boxed()
            .map(n -> -Math.abs(n))
            .map(n -> n + height)
            .map(n -> createRepeatedStringOf(height, pyramidCharacter, n))
            .limit(2 * height + 1)
            .collect(Collectors.joining("\n"))
            .trim();
    }

    private String createRepeatedStringOf(Integer height, String characterToRepeat, Integer times) {
        var repeatCharString = characterToRepeat.repeat(times);
        if (times == height)
            return repeatCharString.concat(">");
        return repeatCharString;
    }

}
