
package com.jaredengler;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextPyramid {

    String generate(final Integer height, final String pyramidCharacter) {
        return IntStream.iterate(-height, i -> i + 1).boxed()
            .map(n -> -Math.abs(n))
            .map(n -> n + height)
            .map(n -> createRepeatedStringOf(height, pyramidCharacter, n))
            .limit(2 * height + 1)
            .collect(Collectors.joining("\n"))
            .trim();
    }

    private String createRepeatedStringOf(final Integer height, final String characterToRepeat, final Integer times) {
        final var repeatCharString = characterToRepeat.repeat(times);
        if (times == height)
            return repeatCharString.concat(">");
        return repeatCharString;
    }

}
