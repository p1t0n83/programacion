/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja1bd;

/**
 *
 * @author iker
 */
import java.util.List;

public interface Repositorio<T> {
  void agregar(T objeto);
  void actualizar(T objeto);
  void eliminar(int id);
  T obtener(int id);
  List<T> listar();
}
