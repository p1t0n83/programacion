/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja6colecciones;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author iker
 */
public abstract class CuentaBancaria implements Identificable{

    protected Persona titular;
    protected double saldo;
    protected String entidad;
    protected String oficina;
    protected String cuenta;

    public CuentaBancaria(Persona titular, String CCC) {
        this.titular = titular;
       CCC=entidad+oficina+cuenta;
    }

    public abstract void ingresar(double cantidad);
     public abstract void retirar(double cantidad);

    @Override
    public Map<String, String> listarObjeto() {
      String nonclave= "titular=" + titular + ", saldo=" + saldo + ", entidad=" + entidad + ", oficina=" + oficina + ", cuenta=" + cuenta + '}';
       Map<String,String> mapa=null;
      mapa.put("Cuenta bancaria:", nonclave);
             return mapa;
    }
    
  
}
