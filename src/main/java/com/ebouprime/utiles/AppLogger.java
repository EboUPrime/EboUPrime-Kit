package com.ebouprime.utiles;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Globale Logger-Instanz für das Projekt.
 *
 * Diese Klasse erweitert {@link java.util.logging.Logger} und stellt eine
 * singleton-Instanz via {@link #getLogger()} bereit. Die Ausgabe wird auf
 * die Konsole geleitet und das Format auf die reine Nachricht reduziert
 * (ohne Datum/Level/Thread), damit ANSI-Farbcodes aus der Anwendung
 * korrekt durchgereicht werden.
 */
public final class AppLogger extends Logger {

    private static final AppLogger INSTANCE = new AppLogger("com.ebouprime.AppLogger");

    private AppLogger(String name) {
        super(name, null);
        setLevel(Level.ALL);

        // Konfiguriere ConsoleHandler so, dass nur die reine Nachricht ausgegeben wird
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord rec) {
                // Nur die Nachricht ausgeben (keine Metadata), damit ANSI-Farben funktionieren
                String msg = rec.getMessage();
                return (msg == null ? "" : msg) + System.lineSeparator();
            }
        });

        // Deaktiviere die Eltern-Handler, damit keine Doppel-Ausgaben auftreten
        setUseParentHandlers(false);

        // Entferne vorhandene Handler (falls welche existieren)
        Handler[] handlers = getHandlers();
        for (Handler h : handlers) {
            removeHandler(h);
        }

        addHandler(consoleHandler);
    }

    /**
     * Liefert die zentrale Logger-Instanz für das Projekt.
     */
    public static AppLogger getLogger() {
        return INSTANCE;
    }


}
