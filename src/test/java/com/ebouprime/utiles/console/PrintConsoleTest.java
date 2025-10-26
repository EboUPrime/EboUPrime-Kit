package com.ebouprime.utiles.console;

import com.ebouprime.utiles.enums.Color;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PrintConsoleTest {

    private final PrintStream originalErr = System.err;
    private ByteArrayOutputStream errContent;

    @BeforeEach
    void setUp() {
        errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.setErr(originalErr);
    }

    @Test
    void printGreen_shouldLogAnsiWrappedMessage() {
        // Act
        Print.printGreen("TestMessage");

        // Flush handlers (Logger uses handlers that write to System.err)
        String out = errContent.toString();

        // Assert: contains green code + message + reset code
        String expected = Color.GREEN.getCode() + "TestMessage" + Color.RESET.getCode();
        assertTrue(out.contains(expected), () -> "Logged output did not contain expected ANSI-wrapped message. Actual: " + out);
    }
}

