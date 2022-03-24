/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Clase que crea un circulo
 * @author alumno
 */
public class Circulo {
    //Atributos
    /**
     * Constante que guarda el valor de PI
     */
    public final float PI=3.1416f;//Variables con mayuscula indican constante
    private float radio;
    //Constructor vacío
    /**
     * Constructor vacío
     */
    public Circulo(){
    }
    //Constructor con parametros
    /**
     * Constructor
     * @param radio valor del radio
     */
    public Circulo(float radio){
        this.radio=radio;
    }
    //Métodos
    /**
     * Método que imprime el perimetro del circulo
     */
    public void perimetro(){
        float perimetro=2*PI*radio;
        System.out.println("Perimetro= "+perimetro);
    }
    /**
     * Método que imprime el área del circulo
     */
    public void area(){
        System.out.println("Área= "+(PI*radio*radio));
    }
    //getters
    public float getRadio(){
        return radio;
    }
    //setters
    public void setRadio(float radio){
        this.radio=Math.abs(radio);
    }
    /**
     * Método que genera el formato para la impresión de n objeto clase Circulo
     * @return formato de los atributos del objeto con sus valores
     */
    public String toString(){//Sobreescritura para que ya no me muestre referencia si no la variable
        return "Circulo {radio= "+radio+"}";//Cambiando representaciòn del objeto
    }
    /*if(radio<=0){
            System.out.println("Error en el radio");
        }else{
            this.radio=radio;   
        }*/
}

