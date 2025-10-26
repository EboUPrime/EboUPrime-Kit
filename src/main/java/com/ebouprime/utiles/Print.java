package com.ebouprime.utiles;

public class Print {

    public static final AppLogger LOGGER = AppLogger.getLogger();

    // Verhindere Instanziierung
    private Print() {
        // Utility class
    }

    public static void print(Object message) {
        String msg = String.valueOf(message);
        printWhite(msg);
    }

    public static void printGreen(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.GREEN.getCode() + msg + Color.RESET.getCode());
    }

    public static void printRed(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.RED.getCode() + msg + Color.RESET.getCode());
    }

    public static void printYellow(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.YELLOW.getCode() + msg + Color.RESET.getCode());
    }

    public static void printBlue(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.BLUE.getCode() + msg + Color.RESET.getCode());
    }

    public static void printPurple(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.PURPLE.getCode() + msg + Color.RESET.getCode());
    }

    public static void printCyan(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.CYAN.getCode() + msg + Color.RESET.getCode());
    }

    public static void printWhite(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.WHITE.getCode() + msg + Color.RESET.getCode());
    }

    public static void printBlack(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.BLACK.getCode() + msg + Color.RESET.getCode());
    }

    public static void printBold(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.BOLD.getCode() + msg + Color.RESET.getCode());
    }

    public static void printUnderline(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.UNDERLINE.getCode() + msg + Color.RESET.getCode());
    }

    public static void printUnderline(Object message, Color color) {
        String msg = String.valueOf(message);
        String messageColored = color.getCode() + msg + Color.RESET.getCode();
        LOGGER.info(Color.UNDERLINE.getCode() + messageColored + Color.RESET.getCode());
    }

    public static void printReversed(Object message) {
        String msg = String.valueOf(message);
        LOGGER.info(Color.REVERSED.getCode() + msg + Color.RESET.getCode());
    }

}

