package com.ebouprime.utiles;

import com.ebouprime.utiles.enums.Color;
import com.ebouprime.utiles.strings.Text;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextTest {

    @Test
    void capitalize_shouldCapitalizeSingleWord() {
        assertEquals("Hello", Text.capitalize("hello"));
        assertEquals("World", Text.capitalize("WORLD"));
    }

    @Test
    void capitalizeWords_shouldCapitalizeEachWord() {
        assertEquals("Hello World", Text.capitalizeWords("hello world"));
        assertEquals("Java Unit", Text.capitalizeWords("java UNIT"));
    }

    @Test
    void redText_shouldWrapWithAnsiCodes() {
        String in = "Error";
        String expected = Color.RED.getCode() + in + Color.RESET.getCode();
        assertEquals(expected, Text.redText(in));
    }

}

