/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author ICABOA
 */
public interface PilaADT<T> {
    
    public T peek() throws Exception;
    public T pop() throws Exception;
    public void push();
    public boolean isEmpty();
    
}
