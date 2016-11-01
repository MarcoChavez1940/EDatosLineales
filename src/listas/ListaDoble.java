/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author A15216350
 */
public class ListaDoble extends ListaD {

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            setInicio(ultimo = new NodoDoble(dato));
        }
        else{
            NodoDoble nuevo = new NodoDoble(dato, getInicio(), null);
            getInicio().setAnterior(nuevo);
            setInicio(nuevo);
        }
    
    }

    @Override
    public void insertaFinal(Object dato) {
    
        if(vacio()){
            setUltimo(inicio = new NodoDoble(dato, getUltimo(), null));
        }
        else{
            NodoDoble nuevo = new NodoDoble(dato,null, getUltimo());
            ultimo.siguiente = nuevo;
            setUltimo(nuevo);
        }
        
    }

    @Override
    public Object eliminaInicio() {
    
        Object eliminado = null;
        
        if(vacio()){
            System.out.println("Lista vacia");
        }
        else{
            eliminado = getInicio().getDato();
            
            if(getInicio() == getUltimo()){
                setInicio(ultimo = null);
            }
            else{
               setInicio(getInicio().siguiente);
               inicio.anterior = null;
            }
        }
    
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
    
        Object eliminado = null;
        
        if(vacio()){
            System.out.println("Lista vacia");
        }
        else{
            eliminado = getUltimo().getDato();
            if(getInicio() == getUltimo()){
                setInicio(ultimo = null);
            }
            setUltimo(getUltimo().anterior);
            ultimo.siguiente=null;
        }
        
        return eliminado;
    }
    
    public static void main(String[] args) {
        ListaDoble listaD = new ListaDoble();
        listaD.insertaInicio(20);
        listaD.insertaInicio("Perro");
        listaD.insertaInicio(25.3);
        listaD.insertaInicio("Hola");
        listaD.insertaFinal("Ultimo");
        listaD.eliminaInicio();
        
        
        System.out.println("Imprimiendo la lista normal...");
        listaD.imprimir();
        System.out.println("\nImprimiendo la lista en orden inverso");
        listaD.imprimirAlRevés();
        System.out.println("\nEliminando el ultimo elemento" + listaD.eliminaFinal());
        System.out.println("Imprimiendo la lista");
        listaD.imprimir();
        System.out.println("Imprimiendo la lista en orden inverso");
        listaD.imprimirAlRevés();
        
    }
    
}
