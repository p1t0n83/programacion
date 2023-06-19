/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colecciones02.otrodeficherosconbd;

/**
 *
 * @author iker
 */
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";

        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Ejemplo de instrucción SELECT
            String sqlSelect = "SELECT * FROM mytable";
            ResultSet resultSet = statement.executeQuery(sqlSelect);
            while (resultSet.next()) {
                // Procesar resultados
            }
            resultSet.close();

            // Ejemplo de instrucción INSERT
            String sqlInsert = "INSERT INTO mytable (column1, column2) VALUES ('value1', 'value2')";
            statement.executeUpdate(sqlInsert);

            // Registrar la instrucción en el archivo de registro
            fileWriter.write(sqlSelect + "\n");
            fileWriter.write(sqlInsert + "\n");

            statement.close();
            connection.close();
            fileWriter.close();
            System.out.println("Instrucciones registradas correctamente.");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}

