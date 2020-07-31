package com.jaredengler;

public class TextPyramid {

    String generate(Integer height, Character c) {
        if (height < 1) {
            return ">";
        }
        return "->";
    }

}
