/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import listas.ListaDoble;


/**
 *
 * @author A15216350
 */
public class PilaListaDoble implements Pila{

    protected ListaDoble pilaLista;
    protected int cont;

    public PilaListaDoble() {
        pilaLista = new ListaDoble();
    }
    
    
    
      
    @Override
    public void push(Object dato) {
        pilaLista.insertaInicio(dato);
        cont++;
    }

    @Override
    public Object pop() {
        if(pilaLista.vacio()){
            return null;
        }
        else{
            cont--;
            return pilaLista.eliminaInicio();
        }
    }

    @Override
    public Object top() {
        if(pilaLista.vacio()){
            return null;
        }
        else{
            return pilaLista.getInicio().getDato();
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return pilaLista.vacio();
    }
    
    
    public static void main(String[] args) {
        PilaListaSimple pila = new PilaListaSimple();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }
        
    }
    
    
    
    
    
}
