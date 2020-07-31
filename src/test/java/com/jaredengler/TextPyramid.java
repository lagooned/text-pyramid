package com.jaredengler;

public class TextPyramid {

    String generate(Integer height) {
        if (height < 1) {
            return "";
        }
        return ">";
    }

}
