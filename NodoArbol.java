/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *GTID141
 * @author Sara Lizbeth Serna Rodriguez
 * EJERCICIO GUIADO - ARBOLES
 * 25/11/25
 * clase nodo
 */
public class NodoArbol <T>{
    private T dato;  
     
    public NodoArbol hijoIzquierdo; 
    public NodoArbol hijoDerecho; 

    public NodoArbol(T dato, NodoArbol hijoIzquierdo, NodoArbol hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }
    
    public NodoArbol(T dato) {
    this.dato = dato;
    this.hijoIzquierdo = null;
    this.hijoDerecho = null;
}


    // ---------------------------------------- 
    // MÉTODOS GETTERS Y SETTERS (Encapsulamiento) 
    // ---------------------------------------- 

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    // Getter para obtener el dato 
    public T getDato() {         
        return dato; 
    } 
 
    // Setter para modificar el dato (Si fuera necesario)     
    public void setDato(T nuevoDato) {         
        this.dato = nuevoDato;
    } 

}
