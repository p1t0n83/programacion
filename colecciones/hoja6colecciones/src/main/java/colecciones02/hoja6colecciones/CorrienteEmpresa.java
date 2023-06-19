/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja6colecciones;

/**
 *
 * @author iker
 */
public class CorrienteEmpresa extends CuentaCorriente{
    private double maximoDescubierto;
    public final double MAX_DESCUBIERTO;

    public CorrienteEmpresa(double maximoDescubierto, double MAX_DESCUBIERTO, boolean siAutoriza, Persona titular, double saldo, String entidad, String oficina, String cuenta) {
        super(siAutoriza, titular, saldo, entidad, oficina, cuenta);
        this.maximoDescubierto = maximoDescubierto;
        this.MAX_DESCUBIERTO = MAX_DESCUBIERTO;
    }
     @Override
    public void ingresar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha ingresado " + cantidad + " euros en la cuenta. Saldo actual: " + saldo + " euros");
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " euros de la cuenta. Saldo actual: " + saldo + " euros");
        } else {
            System.out.println("Saldo insuficiente para retirar la cantidad solicitada");
        }
    }

   
    
            
}
