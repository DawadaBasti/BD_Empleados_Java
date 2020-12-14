
package Entidades;


public class Alumno {
    
    private int idAlumno;
    private String nombres;
    private String apellidos;
    private int edad;
    private int ciclo;
    private char genero;
    private String universidad;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombres, String apellidos, int edad, int ciclo, char genero, String universidad) {
        this.idAlumno = idAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ciclo = ciclo;
        this.genero = genero;
        this.universidad = universidad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", ciclo=" + ciclo + ", genero=" + genero + ", universidad=" + universidad + '}';
    }
    
        
    
    
}
