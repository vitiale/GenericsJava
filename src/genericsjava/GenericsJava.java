/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsjava;

/**
 *
 * @author Alba Proyecto
 */
public class GenericsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase<String> c =new Clase<String>("cadena");
        Clase<Integer> c1 =new Clase<Integer>(27);
        c.tipo_objeto();
        c1.tipo_objeto();
        System.out.println("");
        
        Clase1<String, Integer, String, Long> b = new Clase1("hola",23,"carajos",1L);
        b.tipo_objeto();
    }
    
}
