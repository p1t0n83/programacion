/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja3bd;

/**
 *
 * @author iker
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetodosBD {
    private static MetodosBD instancia;
    private Connection conexion;

    private MetodosBD() {
        // Configurar la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/java_03_verano";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static MetodosBD getInstancia() {
        if (instancia == null) {
            instancia = new MetodosBD();
        }
        return instancia;
    }

    public List<Actividad> obtenerActividades() {
        List<Actividad> actividades = new ArrayList<>();

        try {
            PreparedStatement statement = conexion.prepareStatement("SELECT * FROM actividades");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Actividad actividad = new Actividad();
                actividad.setId(resultSet.getInt("id"));
                actividad.setNombre(resultSet.getString("nombre"));
                actividad.setHorario(resultSet.getString("horario"));
                actividad.setPlazasTotales(resultSet.getInt("plazas_totales"));
                actividad.setPlazasLibres(resultSet.getInt("plazas_libres"));

                actividades.add(actividad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return actividades;
    }

    public void mostrarInformacionActividad(int idActividad) {
        try {
            PreparedStatement statement = conexion.prepareStatement(
                    "SELECT a.*, COUNT(p.id) AS participantes " +
                    "FROM actividades a " +
                    "LEFT JOIN participantes p ON a.id = p.actividad_id " +
                    "WHERE a.id = ? " +
                    "GROUP BY a.id"
            );
            statement.setInt(1, idActividad);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Actividad actividad = new Actividad();
                actividad.setId(resultSet.getInt("id"));
                actividad.setNombre(resultSet.getString("nombre"));
                actividad.setHorario(resultSet.getString("horario"));
                actividad.setPlazasTotales(resultSet.getInt("plazas_totales"));
                actividad.setPlazasLibres(resultSet.getInt("plazas_libres"));

                System.out.println("Información de la actividad:");
                System.out.println(actividad);

                int participantes = resultSet.getInt("participantes");
                System.out.println("Participantes: " + participantes);
            } else {
                System.out.println("No se encontró la actividad con ID " + idActividad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inscribirParticipante(String dni, int idActividad) {
        try {
            // Comprobar si el participante ya está inscrito en otra actividad
            PreparedStatement statement = conexion.prepareStatement(
                    "SELECT * FROM participantes WHERE dni = ?"
            );
            statement.setString(1, dni);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                System.out.println("El participante ya está inscrito en otra actividad.");
                return;
            }

            // Obtener información de la actividad
            statement = conexion.prepareStatement(
                    "SELECT * FROM actividades WHERE id = ?"
            );
            statement.setInt(1, idActividad);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int plazasLibres = resultSet.getInt("plazas_libres");

                if (plazasLibres > 0) {
                    // Actualizar plazas libres en la actividad
                    statement = conexion.prepareStatement(
                            "UPDATE actividades SET plazas_libres = ? WHERE id = ?"
                    );
                    statement.setInt(1, plazasLibres - 1);
                    statement.setInt(2, idActividad);
                    statement.executeUpdate();

                    // Insertar participante
                    statement = conexion.prepareStatement(
                            "INSERT INTO participantes (dni, actividad_id) VALUES (?, ?)"
                    );
                    statement.setString(1, dni);
                    statement.setInt(2, idActividad);
                    statement.executeUpdate();

                    System.out.println("Inscripción exitosa.");
                } else {
                    System.out.println("No hay plazas libres para esta actividad.");
                }
            } else {
                System.out.println("No se encontró la actividad con ID " + idActividad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void anularInscripcion(String dni, int idActividad) {
        try {
            // Obtener información de la actividad
            PreparedStatement statement = conexion.prepareStatement(
                    "SELECT * FROM actividades WHERE id = ?"
            );
            statement.setInt(1, idActividad);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Verificar si el participante está inscrito en la actividad
                statement = conexion.prepareStatement(
                        "SELECT * FROM participantes WHERE dni = ? AND actividad_id = ?"
                );
                statement.setString(1, dni);
                statement.setInt(2, idActividad);
                resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Eliminar participante
                    statement = conexion.prepareStatement(
                            "DELETE FROM participantes WHERE dni = ? AND actividad_id = ?"
                    );
                    statement.setString(1, dni);
                    statement.setInt(2, idActividad);
                    statement.executeUpdate();

                    // Actualizar plazas libres en la actividad
                    int plazasLibres = resultSet.getInt("plazas_libres");
                    statement = conexion.prepareStatement(
                            "UPDATE actividades SET plazas_libres = ? WHERE id = ?"
                    );
                    statement.setInt(1, plazasLibres + 1);
                    statement.setInt(2, idActividad);
                    statement.executeUpdate();

                    System.out.println("Anulación de inscripción exitosa.");
                } else {
                    System.out.println("El participante no está inscrito en la actividad con ID " + idActividad);
                }
            } else {
                System.out.println("No se encontró la actividad con ID " + idActividad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
