/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprint2;

/**
 *
 * @author usuario
 */
public class Transaccion {
    private float monto;
    private String concepto;
    private Empleado empleado;

    public Transaccion() {
    }

    public Transaccion(float monto, String concepto, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
    }
    
      public void cambiarNombre(String nuevaNombre){
         this.empleado.setNombre(nuevaNombre);
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Transacion{" + "monto=" + monto + ", concepto=" + concepto + ", empleado=" + empleado + '}';
    }
    
    
}
