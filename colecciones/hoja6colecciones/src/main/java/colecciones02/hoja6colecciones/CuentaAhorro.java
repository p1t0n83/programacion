/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja6colecciones;

/**
 *
 * @author iker
 */
public class CuentaAhorro extends CuentaBancaria{
    private double tipoInteres;
    public final double MIN_TIPO_INTERES;
    public final double MAX_TIPO_INTERES;

    public CuentaAhorro(double tipoInteres, double MIN_TIPO_INTERES, double MAX_TIPO_INTERES, Persona titular, double saldo, String entidad, String oficina, String cuenta) {
        super(titular, null);
        this.tipoInteres = tipoInteres;
        this.MIN_TIPO_INTERES = MIN_TIPO_INTERES;
        this.MAX_TIPO_INTERES = MAX_TIPO_INTERES;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
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
