package com.systechafrica.pos.logger;

import java.io.IOException;
import java.util.logging.*;

public class FileLogging {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  public static void main(String[] args) throws SecurityException, IOException {
    FileHandler fh = new FileHandler("log.txt");
    CustomFormatter formatter = new CustomFormatter();

    LOGGER.addHandler(fh);
    fh.setFormatter(formatter);

    LOGGER.info("info Message Logging\n");
    LOGGER.severe("Error Message\n");
    LOGGER.warning("Warning Message Logn\n");
    test();

  }

  public static void test() {
    LOGGER.info("info Message Logging\n");
    LOGGER.severe("Error Message\n");
    LOGGER.warning("Warning Message Logn\n");
  }

}
