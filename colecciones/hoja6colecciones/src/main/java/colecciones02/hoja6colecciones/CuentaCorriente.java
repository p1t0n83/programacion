/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja6colecciones;

/**
 *
 * @author iker
 */
public abstract class CuentaCorriente extends CuentaBancaria{
    private boolean siAutoriza;

    public CuentaCorriente(boolean siAutoriza, Persona titular, double saldo, String entidad, String oficina, String cuenta) {
        super(titular, null);
        this.siAutoriza = siAutoriza;
    }

    public boolean isSiAutoriza() {
        return siAutoriza;
    }

    public void setSiAutoriza(boolean siAutoriza) {
        this.siAutoriza = siAutoriza;
    }
}
