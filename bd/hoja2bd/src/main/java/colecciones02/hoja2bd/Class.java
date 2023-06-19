/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja2bd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author iker
 */
// Clase que implementa el patrón Singleton para el acceso a la base de datos
class MetodosBD {
    private static MetodosBD instancia = null;
    private Connection conexion;

    private MetodosBD() {
        // Conexión a la base de datos
        try {
            String url = "jdbc:mysql://localhost/java_02_clinica";
            String usuario = "usuario";
            String contrasena = "contrasena";
            conexion = DriverManager.getConnection(url, usuario, contrasena);
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

    // Método para insertar un paciente en la base de datos
    public void insertarPaciente(String dni, String nombre, String telefono) {
        try {
            PreparedStatement statement = conexion.prepareStatement(
                    "INSERT INTO pacientes (dni, nombre, telefono) VALUES (?, ?, ?)"
            );
            statement.setString(1, dni);
            statement.setString(2, nombre);
            statement.setString(3, telefono);
            statement.executeUpdate();
            System.out.println("Paciente insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para crear una visita asociada a un paciente
    public void crearVisita(String dni, Date fecha, String tratamiento, String observaciones) {
        try {
            // Verificar si el paciente existe
            PreparedStatement statement = conexion.prepareStatement(
                    "SELECT * FROM pacientes WHERE dni = ?"
            );
            statement.setString(1, dni);
            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                System.out.println("El paciente con DNI " + dni + " no existe. Inserte el paciente primero.");
                return;
            }

            // Verificar que la fecha sea igual o superior al día actual
            
            if (fecha.before(Date.valueOf(LocalDate.now()))) {
                System.out.println("La fecha debe ser igual o superior al día actual.");
                return;
            }

            // Insertar la visita en la base de datos
            statement = conexion.prepareStatement(
                    "INSERT INTO visitas (paciente, fecha, tratamiento, observaciones) VALUES (?, ?, ?, ?)"
            );
            statement.setString(1, dni);
            statement.setDate(2, new java.sql.Date(fecha.getTime()));
            statement.setString(3, tratamiento);
            statement.setString(4, observaciones);
            statement.executeUpdate();
            System.out.println("Visita creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para mostrar la agenda de un día específico
    public void mostrarAgenda(Date fecha) {
        try {
            // Verificar que la fecha sea igual o superior al día actual
           
            if (fecha.before(Date.valueOf(LocalDate.now()))) {
                System.out.println("Has seleccionado una fecha anterior al día actual.");
                return;
            }

            // Obtener las visitas programadas para la fecha especificada
            PreparedStatement statement = conexion.prepareStatement(
                    "SELECT * FROM visitas WHERE fecha = ?"
            );
            statement.setDate(1, new java.sql.Date(fecha.getTime()));
            ResultSet resultSet = statement.executeQuery();

            // Mostrar las visitas
            if (resultSet.next()) {
                System.out.println("Agenda para el día " + fecha.toString() + ":");
                do {
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Paciente: " + resultSet.getString("paciente"));
                    System.out.println("Tratamiento: " + resultSet.getString("tratamiento"));
                    System.out.println("Observaciones: " + resultSet.getString("observaciones"));
                    System.out.println("--------------------");
                } while (resultSet.next());
            } else {
                System.out.println("No hay visitas programadas para el día " + fecha.toString() + ".");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para mostrar las visitas de un paciente en orden descendente de fecha
    public void mostrarVisitasPaciente(String dni) {
        try {
            // Verificar si el paciente existe
            PreparedStatement statement = conexion.prepareStatement(
                    "SELECT * FROM pacientes WHERE dni = ?"
            );
            statement.setString(1, dni);
            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                System.out.println("El paciente con DNI " + dni + " no existe.");
                return;
            }

            // Obtener las visitas asociadas al paciente en orden descendente de fecha
            statement = conexion.prepareStatement(
                    "SELECT * FROM visitas WHERE paciente = ? ORDER BY fecha DESC"
            );
            statement.setString(1, dni);
            resultSet = statement.executeQuery();

            // Mostrar las visitas
            if (resultSet.next()) {
                System.out.println("Visitas del paciente con DNI " + dni + ":");
                do {
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Fecha: " + resultSet.getDate("fecha"));
                    System.out.println("Tratamiento: " + resultSet.getString("tratamiento"));
                    System.out.println("Observaciones: " + resultSet.getString("observaciones"));
                    System.out.println("--------------------");
                } while (resultSet.next());
            } else {
                System.out.println("El paciente con DNI " + dni + " no tiene visitas registradas.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}