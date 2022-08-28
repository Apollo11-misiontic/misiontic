/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sprint2;

/**
 *
 * @author usuario
 */
public class Sprint2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // CREAR EMPRESA
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        Empresa emp1 = new Empresa("universidad de antioquia", "Cl. 67 #53-108",
                                    "2198332", "890.980.040-8");
        System.out.println("Imprimir empresa creada: " + emp1);
        // Leer y modificar nombre de la empresa
        System.out.println("nombre empresa: " + emp1.getNombre());
        emp1.setNombre("universidad nacional");
        System.out.println("Nuevo nombre empresa:" + emp1.getNombre());
        // Modificar y leer direccion
        emp1.setDireccion("cll 20 # 100 -13");
        System.out.println("Nueva direccion: " + emp1.getDireccion());
        // Modificar y leer telefono
        emp1.setTelefono("7777777");
        System.out.println("Nuevo telefono: " + emp1.getTelefono());
        // Modificar y leer NIT
        emp1.setNit("2345678");
        System.out.println("Nuevo NIT: " + emp1.getNit());
        System.out.println("*************************************************");
        System.out.println("*************************************************");
    
        // CREAR EMPLEADO
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        Empleado empleado1 = new Empleado("Jose", "jose@gmail.com", emp1, Rol.administrador);
        System.out.println("empleado: " + empleado1);
        // Modificar y leer nombre empleado
        empleado1.setNombre("carlos");
        System.out.println("Nuevo nombre: " + empleado1.getNombre());
        // Modificar y leer correo empleado
        empleado1.setCorreo("carlos@gmail.com");
        System.out.println("Nuevo correo empleado: " + empleado1.getCorreo());
        // Modificar y leer empresa
        empleado1.cambiarEmpresa("universidad del valle");
        System.out.println("leer empresa: " + empleado1.getEmpresa().getNombre());
        // Leer y modificar
        empleado1.setRol(Rol.operativo);
        System.out.println("leer rol: " + empleado1.getRol());
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        
        // CREAR USUARIO
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        Transaccion trans = new Transaccion(100,"pago matricula", empleado1);
        // Leer/modificar monstos positivos/negativos
        trans.setMonto(-10);
        System.out.println("monto negativo: " + trans.getMonto());
        trans.setMonto(20);
        System.out.println("monto positivo: " + trans.getMonto());
        // Leer y modificar conecpto de dinero
        trans.setConcepto("pago servicios");
        System.out.println("concepto: " + trans.getConcepto());
        // cambiar nombre usuario que realizo la transaccion
        trans.cambiarNombre("alejandro");
        System.out.println("nombre usuario transaccion: " + trans.getEmpleado().getNombre());
        System.out.println("*************************************************");
        System.out.println("*************************************************");
    }
    
}
