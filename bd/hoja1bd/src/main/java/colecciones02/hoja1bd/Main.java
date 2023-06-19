/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colecciones02.hoja1bd;

/**
 *
 * @author iker
 */
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static UsuarioDAOImp usuarioDAO = new UsuarioDAOImp();

  public static void main(String[] args) {
    int opcion;

    do {
      mostrarMenu();
      opcion = obtenerOpcion();

      switch (opcion) {
        case 1:
          actualizarUsuario();
          break;
        case 2:
          eliminarUsuario();
          break;
        case 3:
          agregarUsuario();
          break;
        case 4:
          listarUsuarios();
          break;
        case 5:
          salir();
          break;
        default:
          System.out.println("Opción inválida. Intente nuevamente.");
          break;
      }
    } while (opcion != 5);
  }

  private static void mostrarMenu() {
    System.out.println("Gestión de usuarios");
    System.out.println("1. Actualizar");
    System.out.println("2. Eliminar");
    System.out.println("3. Agregar");
    System.out.println("4. Listar");
    System.out.println("5. Salir");
    System.out.print("Seleccione una opción: ");
  }

  private static int obtenerOpcion() {
    return scanner.nextInt();
  }

  private static void actualizarUsuario() {
    // Implementar lógica para actualizar un usuario
  }

  private static void eliminarUsuario() {
    // Implementar lógica para eliminar un usuario
  }

  private static void agregarUsuario() {
    // Implementar lógica para agregar un usuario
  }

  private static void listarUsuarios() {
    // Implementar lógica para listar los usuarios
  }

  private static void salir() {
    try {
      AccesoBaseDatos.cerrarConexion();
      System.out.println("¡Hasta luego!");
      System.exit(0);
    } catch (SQLException e) {
      System.out.println("Error al cerrar la conexión a la base de datos.");
      e.printStackTrace();
    }
  }
}
