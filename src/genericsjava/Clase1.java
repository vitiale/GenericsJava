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
public class Clase1<T,K,V,E> {
    
    private T objeto_t;
    private K objeto_k;
    private V objeto_v;
    private E objeto_e;

    public Clase1(T objeto_t, K objeto_k, V objeto_v, E objeto_e) {
        this.objeto_t = objeto_t;
        this.objeto_k = objeto_k;
        this.objeto_v = objeto_v;
        this.objeto_e = objeto_e;
    }
    
    public void tipo_objeto(){
        System.out.println("objeto_t es del tipo "+objeto_t.getClass().getName());
        System.out.println("objeto_k es del tipo "+objeto_k.getClass().getName());
        System.out.println("objeto_v es del tipo "+objeto_v.getClass().getName());
        System.out.println("objeto_e es del tipo "+objeto_e.getClass().getName());
    }
}
