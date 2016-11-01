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
public abstract class ListaD extends Lista{
    protected NodoDoble inicio;
    protected NodoDoble ultimo;
    
    public boolean vacio(){
        return getInicio() == null;
    }
    
    public void imprimir(){
        //super.setInicio(inicio);
        //super.imprimir();
        
        NodoDoble actual = getInicio();
        while(actual!=null){
            System.out.print(actual.getDato() + " - ");
            actual = actual.siguiente;
        }
        
    }
    
    public void imprimirAlRevés(){
        NodoDoble actual = getUltimo();
        while(actual != null){
            System.out.print(actual.getDato() + " - ");
            actual = actual.getAnterior();
        }
    }

    /**
     * @return the inicio
     */
    public NodoDoble getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public NodoDoble getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }
    
    
    
}
