package com.ebouprime.utiles;

import com.ebouprime.utiles.enums.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    void white_shouldBeBrightWhite97() {
        assertEquals("\u001B[97m", Color.WHITE.getCode());
    }

    @Test
    void red_green_blue_codes() {
        assertEquals("\u001B[31m", Color.RED.getCode());
        assertEquals("\u001B[32m", Color.GREEN.getCode());
        assertEquals("\u001B[34m", Color.BLUE.getCode());
    }
}

