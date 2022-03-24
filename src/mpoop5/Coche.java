/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Clase que crea un coche
 * @author alumno
 */
public class Coche {
    //Atributos
    private String marca;
    private String color;
    private int placa;
    private int numPuertas;
    private int modeloAnio;
    //Actividad extra
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    /**
     * Constructor vacío
     */
    public Coche() {
    }
    //Constructor con parametros
    /**
     * Constructor
     * @param marca marca del coche
     * @param color color del coche
     * @param placa numero de placa del coche
     * @param numPuertas numero de puertas que tiene el coche
     * @param modeloAnio año del coche
     */
    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
    }
    /**
     * Constructor que solo recibe a los pasajeros en su argumento
     * @param chofer variable de tipo persona que es el chofer
     * @param copiloto variable de tipo persona que es el copiloto
     * @param pasajero1 variable de tipo persona que es el primer pasajero
     * @param pasajero2 variable de tipo persona que es el segundo pasajero
     */
    public Coche(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    
    
    //
    
    //Getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public int getModeloAnio() {
        return modeloAnio;
    }
    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }
    //Actividad extra

    public Persona getChofer() {
        return chofer;
    }
    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }
    public Persona getCopiloto() {
        return copiloto;
    }
    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }
    public Persona getPasajero1() {
        return pasajero1;
    }
    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }
    public Persona getPasajero2() {
        return pasajero2;
    }
    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }

    
    //
    //Métodos
    /**
     * Método que enciende el coche
     */
    public void encender(){
        System.out.println("Estoy encendiendo");
    }
    /**
     * Método que apaga el coche
     */
    public void apagar(){
        System.out.println("Me voy a apagar");
    }
    /**
     * Método que frena el coche
     */
    public void frenar(){
        System.out.println("Frenando");
    }
    /**
     * Método que toca el claxón del coche
     */
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    /**
     * Método que acelera el coche
     * @param velocidad valor que representa la velocidad con la que va el coche
     */
    public void acelerar(int velocidad){
        System.out.println("Voy a una velocidad de "+velocidad+"km/h");
    }
    /*
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", placa=" + placa + ", numPuertas=" + numPuertas + ", modeloAnio=" + modeloAnio + '}';
    }*/

    @Override
    public String toString() {
        return "Coche{" + "chofer=" + chofer + ", copiloto=" + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }

   
}
