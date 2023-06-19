/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja1bd;

/**
 *
 * @author iker
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoBaseDatos {
  private static final String URL = "jdbc:mysql://localhost/bd_prog_01";
  private static final String USER = "root";
  private static final String PASSWORD = "password";
  private static Connection connection;

  private AccesoBaseDatos() {
    // Constructor privado para evitar instanciación
  }

  public static Connection obtenerConexion() throws SQLException {
    if (connection == null) {
      connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    return connection;
  }

  public static void cerrarConexion() throws SQLException {
    if (connection != null && !connection.isClosed()) {
      connection.close();
    }
  }
}

