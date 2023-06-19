/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja3bd;

/**
 *
 * @author iker
 */
public class Teclado {
    public static boolean validarDni(String dni) {
        // Eliminar posibles espacios en blanco al principio o al final del DNI
        dni = dni.trim();

        // Patrón de expresión regular para validar el formato del DNI
        String patron = "^\\d{8}[A-HJ-NP-TV-Z]$";

        // Verificar si el DNI coincide con el patrón
        if (dni.matches(patron)) {
            // Obtener el número y la letra del DNI
            int numero = Integer.parseInt(dni.substring(0, 8));
            char letra = Character.toUpperCase(dni.charAt(8));

            // Calcular la letra correspondiente al número del DNI
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int indiceLetra = numero % 23;
            char letraCalculada = letras.charAt(indiceLetra);

            // Verificar si la letra del DNI es correcta
            return letra == letraCalculada;
        }

        return false;
    }
}

