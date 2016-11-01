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
public class ListaSimple extends Lista {

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio = ultimo = new Nodo(dato);
        }
        else{
            inicio = new Nodo(dato,inicio);
        }
    
    }

    @Override
    public void insertaFinal(Object dato) {
        if(vacio()){
            inicio = ultimo = new Nodo(dato);
        }
        else{
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
            ultimo = temp;
        }
    
    }

    @Override
    public Object eliminaInicio() {
       Object eliminado;
       if(vacio()){
           eliminado=null;
       }
       else{
           eliminado = inicio.getDato();
           inicio = inicio.getSiguiente();
       }
        
    
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
    
        
    return 0;
    }
    
    public Object get(int index){
        
        return 0;
    }
    
    public void insertaOrdenado(int dato){
        
        if(vacio()){
            insertaInicio(dato);
        }
        else{
            
            if(inicio==ultimo){ //solo hay un nodo en lista
                    if(dato< (Integer)inicio.getDato()){
                        insertaInicio(dato);
                    }
                    else{
                        insertaFinal(dato);
                    }
            }
            
            else{ //la lista coontiene mas de un elemento
                Nodo antes =null, despues = inicio;
                while(despues != null && dato > (Integer)despues.getDato()){
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
                        Nodo nuevo = new Nodo(dato,despues);
                        antes.setSiguiente(nuevo);
                    }
                }
                
                
            }
            
        }
        
    }
    
    public void insertaOrdenado(Alumno alumno){
        
        if(vacio()){
            insertaInicio(alumno);
        }
        else{
            
            if(inicio==ultimo){ //solo hay un nodo en lista
                
                    if(alumno.getEdad() < ((Alumno)inicio.getDato()).getEdad()){
                        insertaInicio(alumno);
                    }
                    else{
                        insertaFinal(alumno);
                    }
            }
            
            else{ //la lista coontiene mas de un elemento
                
                Nodo antes =null, despues = inicio;
                
                while(despues != null && alumno.getEdad() > ((Alumno)despues.getDato()).getEdad()){
                    antes = despues;
                    despues = despues .getSiguiente();
                    
                }
                if (antes==null){
                    insertaInicio(alumno);
                }
                else{
                    if(despues==null){
                        insertaFinal(alumno);
                    }
                    else{
                        Nodo nuevo = new Nodo(alumno,despues);
                        antes.setSiguiente(nuevo);
                    }
                }
                
                
            }
            
        }
        
    }
    
            
    
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        /*lista.insertaInicio(25);
        lista.insertaInicio("perro");
        lista.insertaInicio(256.3);
        lista.insertaInicio("f");
        lista.insertaFinal("casa");
        lista.eliminaInicio();*/
        Alumno alumno1 = new Alumno("marco", "chavez", 11);
        Alumno alumno2 = new Alumno("mario", "kevin", 40);
        Alumno alumno3 = new Alumno("adrian", "chavez", 21);
        Alumno alumno4 = new Alumno("israel", "pool", 27);
        
        lista.insertaOrdenado(alumno1);
        lista.insertaOrdenado(alumno2);
        lista.insertaOrdenado(alumno3);
        lista.insertaOrdenado(alumno4);
        
        
        lista.imprimir();
        //lista.get(1,lista);
        
        
    }
    
}
