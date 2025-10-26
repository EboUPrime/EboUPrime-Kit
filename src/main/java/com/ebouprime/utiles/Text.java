package com.ebouprime.utiles;

public class Text {
    /**
     * A utility class for text manipulation and coloring in console output.
     * Provides methods to capitalize strings and color them in red, green, yellow, or blue.
     */

    private Text(){}

    public static String capitalize(String str) {
        /*
         * Capitalizes the first letter of the given string.
         * @param str The input string.
         * @return The capitalized string.
         * example: "hello" -> "Hello"
         */
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String capitalizeWords(String str) {
        /*
         * Capitalizes the first letter of each word in the given string.
         * @param str The input string.
         * @return The string with each word capitalized.
         * example: "hello world" -> "Hello World"
         */
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder capitalizedWords = new StringBuilder();
        for (String word : words) {
            capitalizedWords.append(capitalize(word)).append(" ");
        }
        return capitalizedWords.toString().trim();
    }

    // --- new, clearer method names ---

    public static String redText(String str) {
        /*
         * Colors the given string in red for console output.
         */
        return Color.RED.getCode() + str + Color.RESET.getCode();
    }

    public static String greenText(String str) {
        /*
         * Colors the given string in green for console output.
         */
        return Color.GREEN.getCode() + str + Color.RESET.getCode();
    }

    public static String yellowText(String str) {
        /*
         * Colors the given string in yellow for console output.
         */
        return Color.YELLOW.getCode() + str + Color.RESET.getCode();
    }

    public static String blueText(String str) {
        /*
         * Colors the given string in blue for console output.
         */
        return Color.BLUE.getCode() + str + Color.RESET.getCode();
    }

}
