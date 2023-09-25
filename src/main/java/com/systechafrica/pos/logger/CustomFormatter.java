package com.systechafrica.pos.logger;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;

public class CustomFormatter extends Formatter {

  @Override
  public String format(LogRecord record) {

    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
    String method = record.getSourceMethodName();
    String level = record.getLevel().getName();
    String message = record.getMessage();
    // record.getParameters();
    Instant instant = record.getInstant();
    LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    return pattern.format(now) + " || " + method + " || " + level + " || " + message;
  }

}