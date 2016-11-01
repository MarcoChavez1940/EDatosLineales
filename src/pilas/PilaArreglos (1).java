/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author A15216350
 */
public class PilaArreglos implements Pila{

    protected Object arreglo[];
    protected int cont;
    
    
    
    public PilaArreglos(){
        arreglo = new Object[100];
    }
    
    
    @Override
    public void push(Object dato){
        arreglo[cont] = dato;
        cont++;
    }

    @Override
    public Object pop() {
        Object eliminado = new Object();
        if(isEmpty()){
            return null;
        }else{
            eliminado = arreglo[cont];
            arreglo[cont] = null;
            cont--;

            return eliminado;
        }
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            return null;
        }else{
            return arreglo[cont];
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        if (cont < 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        PilaArreglos pila = new PilaArreglos();
        
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
        
    }
    
}
