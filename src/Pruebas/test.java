
package Pruebas;

import Alumnos.AlumnoBO;
import Entidades.Alumno;

public class test {
    AlumnoBO ebo    = new AlumnoBO();
    Alumno emp      = new Alumno();
    String mensaje  = "";
    
    public void insertar(){
        emp.setNombres("SEBASTIAN");
        emp.setApellidos("INGA");
        emp.setEdad(22);
        emp.setCiclo(5);
        emp.setGenero('M');
        emp.setUniversidad("Univeridad BUTI");
        
        mensaje = ebo.agregarAlumno(emp);
        System.out.println(mensaje);
    }
    
    public void modificar(){
        emp.setIdAlumno(10);
        emp.setNombres("BRAYAN");
        emp.setApellidos("SAUÑE");
        emp.setEdad(45);
        emp.setCiclo(10);
        emp.setGenero('F');
        emp.setUniversidad("Univeridad de Burros");
        
        mensaje = ebo.modificarAlumno(emp);
        System.out.println(mensaje);
    }
    
    public void eliminar(){
        
        
        mensaje = ebo.eliminarAlumno(9);
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        test test1 = new test();
        test1.insertar();
        //test1.modificar();
       
        //test1.eliminar();
        
    }
}
