package com.ebouprime.utiles;

public enum Color {
    RESET("\u001B[0m"), // to reset color
    BLACK("\u001B[30m"), // for color black
    RED("\u001B[31m"), // for color red
    GREEN("\u001B[32m"), // for color green
    YELLOW("\u001B[33m"), // for color yellow
    BLUE("\u001B[34m"), // for color blue
    PURPLE("\u001B[35m"), // for color purple
    CYAN("\u001B[36m"), // for color cyan
    GRAY("\u001B[37m"), // for color gray
    WHITE("\u001B[97m"), // for bright white
    BOLD("\u001B[1m"), // for bold text
    UNDERLINE("\u001B[4m"), // for underline text
    REVERSED("\u001B[7m"); // for reversed text

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
