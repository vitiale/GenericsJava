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
public class Clase<T> {
     private T objeto;

    public Clase(T objeto) {
        this.objeto = objeto;
    }
     
     public void tipo_objeto(){
         System.out.println("T es del tipo "+objeto.getClass().getName());
     }
    
}
