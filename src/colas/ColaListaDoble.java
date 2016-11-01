/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import listas.ListaDoble;

/**
 *
 * @author A15216350
 */
public class ColaListaDoble implements Queue {

    protected ListaDoble lista;
    protected int cont;

    public ColaListaDoble() {
        lista = new ListaDoble();
        cont=0;
    }
    
    
    
    @Override
    public void enqueue(Object dato) {
        lista.insertaFinal(dato);  //Podemos hacer un insertar unicio aqui pero en dequeue debemos hacer elimina final
        cont++;
    }

    @Override
    public Object dequeue() {
        
        if(!lista.vacio()){
            cont--;
            return lista.eliminaInicio();
        }
        return null;
        
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public Object front(){
        if(!lista.vacio()){
            return lista.getInicio().getDato(); //Igual este se debe invertir si usamos la otra forma.
        }
        return null;
    }
    

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
    
    public static void main(String[] args) {
        ColaListaDoble cola = new ColaListaDoble();
        
        cola.enqueue("Hola");
        cola.enqueue(336);
        cola.enqueue(25.78);
        cola.enqueue(true);
        System.out.println(cola.front());
        
        
        
        
        
    }
    
}
