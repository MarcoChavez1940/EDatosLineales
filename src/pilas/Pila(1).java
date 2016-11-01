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
public interface Pila {
    
    public void push(Object dato);
    public Object pop();
    public Object top();
    public int size();
    public boolean isEmpty();
    
}
