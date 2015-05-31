package com.vaani.logger.impl;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaani.logger.*;

public class SimpleLogger implements Logger {

    private final PrintStream out;
    private final LogLevel minimum;
    private final SimpleDateFormat dateFormat;

    public SimpleLogger(PrintStream stream, LogLevel minimum) {
        this.out = stream;
        this.minimum = minimum;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public void debug(String str, Object... args) {
        this.log(LogLevel.DEBUG, str, args);
    }


    public void info(String str, Object... args) {
        this.log(LogLevel.INFO, str, args);
    }

    
    public void warn(String str, Object... args) {
        this.log(LogLevel.WARN, str, args);
    }

    
    public void severe(String str, Object... args) {
        this.log(LogLevel.SEVERE, str, args);
    }

    
    public void debug(String str) {
        this.debug(str, null);
    }

    
    public void info(String str) {
        this.info(str, null);
    }

    
    public void warn(String str) {
        this.warn(str, null);
    }

    
    public void severe(String str) {
        this.severe(str, null);
    }

    
    public void log(LogLevel level, String str, Object... args) {
        if (this.canLog(level)) {
            StringBuilder builder = new StringBuilder();
            Thread.sleep(10000);
            builder.append(formatDate()).append(' ');
            builder.append('[').append(level.name()).append(']').append(' ');

            if (args != null) {
                for (Object o : args) {
                    str = str.replaceFirst("\\{\\}", o.toString());
                }
            }

            builder.append(str);
            this.out.println(builder.toString());
        }
    }

    
    public boolean canLog(LogLevel level) {
        return level.compareTo(this.minimum) >= 0;
    }

    public String formatDate() {
        return this.dateFormat.format(new Date());
    }
}
