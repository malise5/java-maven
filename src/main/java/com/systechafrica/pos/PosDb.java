package com.systechafrica.pos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.pos.logger.CustomFormatter;

public class PosDb {

  private static final Logger LOGGER = Logger.getLogger(PosDb.class.getName());

  public static void main(String[] args) {

    // using scanner for inputs
    Scanner scanner = new Scanner(System.in);

    FileHandler fh;

    try {
      fh = new FileHandler("PosDataBase.txt");
      CustomFormatter formatter = new CustomFormatter();
      LOGGER.addHandler(fh);
      fh.setFormatter(formatter);

      // ==============Connecting database=================

      // 1.Add the jdbc driver to pom.xml file
      // 2. Load Database Driver
      Class.forName("com.mysql.jdbc.Driver");

      // Setting the credentials
      String url = "jdbc:mysql://127.0.0.1:3306/javadb";
      String username = "javauser";
      String password = "javauser";

      // 3.Create a connection to the Dtaabase
      Connection connection = DriverManager.getConnection(url, username, password);

      // 4. create a statement from the connection
      Statement statement = connection.createStatement();

      // line to execute
      String createSalesTable = "CREATE TABLE IF NOT EXISTS sales (id INT AUTO_INCREMENT PRIMARY KEY,item VARCHAR(100) NOT NULL,quantity INT,unit_price INT)ENGINE=INNODB;";

      // 5. eXECUTE SQL qUERIES OR uPDATES
      // CREATING THE TABLE
      int updateStatus = statement.executeUpdate(createSalesTable);
      LOGGER.info("Updates status: " + updateStatus + "\n");

      // Inserting Values into respective tables
      String insertQuery = "INSERT INTO sales (item, quantity, unit_price) VALUES(?,?,?);";
      PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

      // reading inputs from the user
      PosItems sales = getSalesDetails(scanner);

      // set the values into the table
      preparedStatement.setString(1, sales.getItem());
      preparedStatement.setInt(2, sales.getQuantity());
      preparedStatement.setInt(3, sales.getUnitPrice());
      int numberOfSales = preparedStatement.executeUpdate();
      LOGGER.info("Number of sales Inserted = " + numberOfSales);

      // execute the Selections query
      String selectQuery = "SELECT * FROM sales;";
      ResultSet results = statement.executeQuery(selectQuery);

      // Iterate over the results
      while (results.next()) {
        // item, quantity, unit_price
        int id = results.getInt("id");
        String item = results.getString("item");
        int quantity = results.getInt("quantity");
        int unit_price = results.getInt("unit_price");

        PosItems dbSales = new PosItems(id, item, quantity, unit_price);
        System.out.println(dbSales);

        // =================Output in the DB==========
        // +------------------+
        // | Tables_in_javadb |
        // +------------------+
        // | sales |
        // | students |
        // +------------------+
        // 2 rows in set (0.17 sec)

        // mysql> SELECT * from sales;
        // +----+----------+----------+------------+
        // | id | item | quantity | unit_price |
        // +----+----------+----------+------------+
        // | 1 | cakes | 5 | 200 |
        // | 2 | tomatoes | 5 | 200 |
        // +----+----------+----------+------------+
        // 2 rows in set (0.00 sec)

      }

    } catch (SecurityException e) {
      System.out.println("Unable to obtain security permission for the log file " + e.getMessage());

    } catch (IOException e) {
      LOGGER.severe("Unable to read/Write permission for the log file " + e.getMessage() + "\n");

    } catch (ClassNotFoundException e) {
      LOGGER.severe("Unable to obtain class for jdbc driver, add it To the pom.xml " + e.getMessage());

    } catch (SQLException e) {
      LOGGER.severe("Database operation failure" + e.getMessage() + "\n");
    }

  }

  private static PosItems getSalesDetails(Scanner scanner) {
    System.out.print("Enter Your password: ");
    String pass = scanner.nextLine();

    try {
      PosItems admin = new PosItems();

      if (admin.getDefaultPassword().equals(pass)) {
        System.out.println("\n************* Welcome ***************\n");

        System.out.print("Enter Customer Item: ");
        String item = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Unit Price: ");
        int unitPrice = Integer.parseInt(scanner.nextLine());

        // Create and return PosItems instance with provided details
        return new PosItems(item, quantity, unitPrice);
      } else {
        System.out.println("******** Wrong Password *************");
      }
    } catch (NumberFormatException e) {
      LOGGER.severe("Invalid input for quantity or unitPrice. Please enter valid numbers.");
    }

    return null; // Return null in case of invalid input or wrong password
  }

}
