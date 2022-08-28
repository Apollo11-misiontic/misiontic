/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprint2;

/**
 *
 * @author usuario
 */
public class Empleado {
    private String nombre;
    private String correo;
    private Empresa empresa;
    private Rol rol;

    public Empleado() {
    }
    
    public Empleado(String nombre, String correo, Empresa empresa, Rol rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    
    public void cambiarEmpresa(String nuevaEmpresa){
         this.empresa.setNombre(nuevaEmpresa);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", correo=" + correo + ", empresa=" + empresa + ", rol=" + rol + '}';
    }
    
    
}
