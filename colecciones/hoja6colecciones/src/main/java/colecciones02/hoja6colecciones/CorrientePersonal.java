/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja6colecciones;

/**
 *
 * @author iker
 */
public class CorrientePersonal extends CuentaCorriente{
    private double comisionMantenimiento;
    public final double MIN_COMISION_MANTENIMIENTO;
    public final double MAX_COMISION_MANTENIMIENTO; 

    public CorrientePersonal(double comisionMantenimiento, double MIN_COMISION_MANTENIMIENTO, double MAX_COMISION_MANTENIMIENTO, boolean siAutoriza, Persona titular, double saldo, String entidad, String oficina, String cuenta) {
        super(siAutoriza, titular, saldo, entidad, oficina, cuenta);
        this.comisionMantenimiento = comisionMantenimiento;
        this.MIN_COMISION_MANTENIMIENTO = MIN_COMISION_MANTENIMIENTO;
        this.MAX_COMISION_MANTENIMIENTO = MAX_COMISION_MANTENIMIENTO;
    }

     
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public double getMIN_COMISION_MANTENIMIENTO() {
        return MIN_COMISION_MANTENIMIENTO;
    }

    public double getMAX_COMISION_MANTENIMIENTO() {
        return MAX_COMISION_MANTENIMIENTO;
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
