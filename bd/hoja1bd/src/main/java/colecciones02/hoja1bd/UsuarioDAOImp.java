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
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAOImp implements Repositorio<Usuario> {
  private Connection conexion;

  public UsuarioDAOImp() {
    try {
      conexion = AccesoBaseDatos.obtenerConexion();
    } catch (SQLException e) {
      // Manejar excepción
    }
  }

  @Override
  public void agregar(Usuario usuario) {
    // Implementar lógica para agregar un usuario a la base de datos
  }

  @Override
  public void actualizar(Usuario usuario) {
    // Implementar lógica para actualizar un usuario en la base de datos
  }

  @Override
  public void eliminar(int id) {
    // Implementar lógica para eliminar un usuario de la base de datos
  }

  @Override
  public Usuario obtener(int id) {
    // Implementar lógica para obtener un usuario de la base de datos
    return null;
  }

  @Override
  public List<Usuario> listar() {
    // Implementar lógica para obtener una lista de usuarios de la base de datos
    return null;
  }
}
