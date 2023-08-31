package com.systechafrica.variables;

import java.util.logging.Logger;

public class VariableScopes {
  private static final Logger LOGGER = Logger.getLogger(VariableScopes.class.getName());

  public void simpleMethod() {
    LOGGER.info("simple method");
  }

  public static void main(String[] args) {

    VariableScopes app = new VariableScopes();

    app.simpleMethod();

  }

}
