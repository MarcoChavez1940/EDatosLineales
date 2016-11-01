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
public abstract class Lista {
    protected Nodo inicio;
    protected Nodo ultimo;
    protected String nombre;
    
    public Lista(){
        this("lista");
    }
    
    public Lista(String nombre){
        this.nombre=nombre;
        
        //Esto seria lo que hace este metodo
        // if (inicio==null)
            //return true;
        //else
            //return false;
    }
    
    public int get(int i, ListaSimple lista){
        
        try{
            System.out.println("");
            int j=0;
            while (j<=i){
                if(j<i){
                    lista.setInicio(lista.getInicio().getSiguiente());
                    j++;

                }
                else{
                    System.out.println(lista.getInicio().getDato());
                    return 0;
                }
            }
        }
        //Hay que tratar de evitar una excepcion (try-catch). Lo ideal era poner en el while hasta que sea distinto
        //de un valor nulo(o sea el final de la lista simple, el ultimo nodo).
        catch (Exception e){
            System.out.println("Indice supera el numero de elementos de la lista");
        }

        return 0;
    }

    public boolean vacio(){
        return inicio==null;
    }
    
    public abstract void insertaInicio(Object dato);
    public abstract void insertaFinal(Object dato);
    public abstract Object eliminaInicio();
    public abstract Object eliminaFinal();
    
    
    public void imprimir(){
        Nodo actual = inicio;
        while(actual!=null){
            System.out.print(actual.getDato() + "->");
            actual = actual.siguiente;
        }
    }
    
    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
