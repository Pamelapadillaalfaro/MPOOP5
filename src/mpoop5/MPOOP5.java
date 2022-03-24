/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 *Clase principal
 * @author alumno
 */
public class MPOOP5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circ1= new Circulo();
        //circ1.radio=15;//Aqui no aprece la opcion radio con el operador punto proque ya hay restriccion en el acceso
        circ1.setRadio(5);
        System.out.println(circ1.getRadio());
        circ1.area();
        circ1.perimetro();
        //Con un get se sacan los datos
        System.out.println(circ1.toString());
        System.out.println(circ1);
        Circulo circ2= new Circulo();
        circ2.setRadio(-15);
        System.out.println(circ2);
        
        System.out.println("####coche####");
        Coche coche=new Coche();
        System.out.println(coche);
        
        System.out.println("###persona####");
        Persona persona1=new Persona();
        persona1.setNombre("Pamela");
        persona1.setApellido("Padilla");
        
        //persona1.setfNacimiento(fNacimiento);
        System.out.println(persona1);
        //Generando fecha
        Fecha fecha=new Fecha(6,7,2001);//Como no la vuelvo a utilizar no necesito  nombrar variable
        persona1.setfNacimiento(fecha);
        System.out.println(persona1);
        
        System.out.println("###persona2####");
        Persona persona2=new Persona();
        persona2.setNombre("Juan");
        persona2.setApellido("Cruz");
        persona2.setfNacimiento(new Fecha(15,6,2002));//Aqui solo se crea la fecha no se guarda variable
        System.out.println(persona2);
        
        System.out.println("####persona3####");
        Persona persona3=new Persona("Alan","Martinez",new Fecha(16,2,2002));
        System.out.println(persona3);
        
        System.out.println("#####persona4#####");
        Persona persona4=new Persona("Sofia","Vazquez",12,9,1999);//sin poner fecha
        System.out.println(persona4);
        
        System.out.println("####Actividad extra####");
        Persona chofer=new Persona("Fernanda", "Hernández",new Fecha(18,9,1991),"Chofer");
        Persona copiloto=new Persona("Blanca", "Alfaro",new Fecha(27,9,1987),"Copiloto");
        Persona pasajero1=new Persona("Alberto", "Pérez",new Fecha(16,1,1976),"Pasajero");
        Persona pasajero2=new Persona("Jorge","Vega",new Fecha(18,10,1953),"Pasajero");
        Coche autobus = new Coche(chofer, copiloto, pasajero1, pasajero2);
        //Corroborando que adentro del objeto autobus si esten las personas.
        System.out.println(autobus);
        chofer.decirLugar();
        copiloto.decirLugar();
        pasajero1.decirLugar();
        pasajero2.decirLugar();
    }
}
