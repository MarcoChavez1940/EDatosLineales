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
public class ListaPrioridad extends ListaSimple{
    
    public void insertaOrdenado(NodoPrioridad dato){
        
        if(vacio()){
            insertaInicio(dato);
        }
        else{
            
            if(inicio==ultimo){ //solo hay un nodo en lista
                    if(dato.getPrioridad()< ((NodoPrioridad)inicio.getDato()).getPrioridad()){
                        insertaInicio(dato);
                    }
                    else{
                        insertaFinal(dato);
                    }
            }
            
            else{ //la lista coontiene mas de un elemento
                Nodo antes =null, despues = inicio;
                while(despues != null && dato.getPrioridad() > ((NodoPrioridad)despues.getDato()).getPrioridad()){
                    antes = despues;
                    despues = despues .getSiguiente();
                }
                if (antes==null){
                    insertaInicio(dato);
                }
                else{
                    if(despues==null){
                        insertaFinal(dato);
                    }
                    else{
                        Nodo nuevo = new Nodo(dato,despues); //Se hace un nuevo nodo y su dato es un nodoPrioridad
                        antes.setSiguiente(nuevo);
                    }
                }
                
                
            }
            
        }
        
    }
    
    public static void main(String[] args) {
       NodoPrioridad nodo1 = new NodoPrioridad(1000, "Perro");
       NodoPrioridad nodo2 = new NodoPrioridad(3, 39);
       NodoPrioridad nodo3 = new NodoPrioridad(5, "Hola");
       NodoPrioridad nodo4 = new NodoPrioridad(2, 25.3);
       ListaPrioridad listaP = new ListaPrioridad();
       listaP.insertaOrdenado(nodo4);
       listaP.insertaOrdenado(nodo1);
       listaP.insertaOrdenado(nodo3);
       listaP.insertaOrdenado(nodo2);
       listaP.imprimir();
       
    }
    
}
