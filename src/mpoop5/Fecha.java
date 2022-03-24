/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Clase que crea una fecha
 * @author alumno
 */
public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    //Constructores
    /**
     * Constructor vacío
     */
    public Fecha() {
    }
    /**
     * Constructor
     * @param dia numero de día
     * @param mes numero de mes
     * @param anio numero de año
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //Getters y setters
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }
    
}
