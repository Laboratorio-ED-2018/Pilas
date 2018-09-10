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
public class Pila<T> implements PilaADT<T> {
    
    T[] arr;
    private final int INITIAL_CAPACITY = 10;
    private int count = 0;
    
    public Pila() {
        arr = (T[]) new Object[INITIAL_CAPACITY];
    }
    
    public Pila(int capacity) {
        arr = (T[]) new Object[capacity];
    }

    @Override
    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("La pila esta vacia");
        } 
        
        return arr[count-1];
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("La pila esta vacia");
        } 
        
        T data = arr[count - 1];
        arr[count -1] = null;
        count --;
        return data;
    }

    @Override
    public void push(T t) {
        if (count == arr.length) {
            expand();
        } 
        
        arr[count] = t;
        count ++;
    }
    
    private void expand() {
        T[] aux = (T[]) new Object[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            T t = arr[i];
            aux[i] = t;
        }
        arr = aux;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    
}
