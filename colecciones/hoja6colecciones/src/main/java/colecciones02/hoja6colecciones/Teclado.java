/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja6colecciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Teclado {

    public double validaComisionMantenimiento(double comision,double min,double max) {
        while (true) {
            try {
               

                if (comision >= min && comision <= max) {
                    break; // Salir del bucle si el número es válido
                } else {
                    System.out.println("Error: el número debe estar entre 1 y 30.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }

        return  comision;
    }

    public boolean validarCuenta(String CCC) {
        // Eliminar espacios y convertir a una cadena de dígitos
        CCC = CCC.replaceAll("\\s+", "");

        // Comprobar que la cuenta tiene 20 dígitos
        if (CCC.length() != 20) {
            return false;
        }

        // Comprobar que todos los caracteres son dígitos
        if (!CCC.matches("\\d+")) {
            return false;
        }

        // Obtener los dígitos de control
        String entidadOficina = CCC.substring(0, 8);
        String numeroCuenta = CCC.substring(10, 20);

        // Calcular el primer dígito de control
        int factor = 1;
        int suma = 0;
        for (int i = entidadOficina.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(entidadOficina.charAt(i));
            suma += digito * factor;
            factor *= 2;
        }
        int resto = suma % 11;
        int primerDigitoControl = 11 - resto;
        if (primerDigitoControl == 10) {
            primerDigitoControl = 1;
        } else if (primerDigitoControl == 11) {
            primerDigitoControl = 0;
        }

        // Calcular el segundo dígito de control
        factor = 1;
        suma = 0;
        for (int i = numeroCuenta.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroCuenta.charAt(i));
            suma += digito * factor;
            factor *= 2;
        }
        resto = suma % 11;
        int segundoDigitoControl = 11 - resto;
        if (segundoDigitoControl == 10) {
            segundoDigitoControl = 1;
        } else if (segundoDigitoControl == 11) {
            segundoDigitoControl = 0;
        }

        // Comprobar los dígitos de control
        int digitoControl1 = Character.getNumericValue(CCC.charAt(8));
        int digitoControl2 = Character.getNumericValue(CCC.charAt(9));
        if (digitoControl1 == primerDigitoControl && digitoControl2 == segundoDigitoControl) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarTipoInteres(double tipoInteres) {
        double minimo = 0.50;
        double maximo = 8.50;

        // Comprobar que el tipo de interés está dentro del rango permitido
        if (tipoInteres >= minimo && tipoInteres <= maximo) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarComisionMantenimiento(double comisionMantenimiento) {
        double minimo = 0.0;
        double maximo = 30.0;

        // Comprobar que la comisión de mantenimiento está dentro del rango permitido
        if (comisionMantenimiento >= minimo && comisionMantenimiento <= maximo) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarMaximoDescubierto(double maximoDescubierto) {
        double limiteMaximo = 50000.0;

        // Comprobar que el máximo descubierto está dentro del límite permitido
        if (maximoDescubierto <= limiteMaximo) {
            return true;
        } else {
            return false;
        }
    }

    public Date pedirFecha() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);

        System.out.println("Introduce una fecha (formato dd-mm-yyyy): ");
        String fechaTexto = System.console().readLine();

        try {
            Date fecha = sdf.parse(fechaTexto);
            return fecha;
        } catch (ParseException e) {
            throw new ParseException("Fecha no válida. Formato incorrecto o valores inválidos.", e.getErrorOffset());
        }
    }
}

