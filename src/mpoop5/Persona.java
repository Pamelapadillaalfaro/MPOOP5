/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Clase que crea a una persona
 * @author alumno
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
    //Actividad extra
    private String lugar;
    /**
     * Constructor vacío
     */
    public Persona() {
    }
    //Constructor con parametros
    /**
     * Constructor
     * @param nombre variable de tipo cadena que indica el nombre de la persona
     * @param apellido variable de tipo cadena que indica el apellido de la persona
     * @param fNacimiento variable de tipo Fecha con la fecha de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    //Actvidad extra
    /**
     * Constructor
     * @param nombre variable de tipo cadena que indica el nombre de la persona
     * @param apellido variable de tipo cadena que indica el apellido de la persona
     * @param fNacimiento variable de tipo Fecha con la fecha de nacimiento de la persona
     * @param lugar variable de tipo cadena que indica el lugar donde está la persona
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento, String lugar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.lugar = lugar;
    }
    
    //
    //Modificando constructor para que reciba el nombre y mes de nacimiento
    /**
     * Constructor
     * @param nombre variable de tipo cadena que indica el nombre de la persona
     * @param apellido variable de tipo cadena que indica el apellido de la persona
     * @param dia numero de día
     * @param mes numero de mes
     * @param anio numero de año
     */
    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento= new Fecha(dia,mes,anio);
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    //Actividad extra 

    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    //Actividad extra
    /**
     * Método que dice el lugar donde está la persona
     */
    public void decirLugar(){
        System.out.println("Estoy en el lugar del "+ getLugar());//Terminar...
    }
    //
    /*
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }*/
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + ", lugar=" + lugar + '}';
    }
}
