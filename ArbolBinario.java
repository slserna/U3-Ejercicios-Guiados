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
 * clase ArbolBinario
 */

public class ArbolBinario<T extends Comparable<T>> {

    private NodoArbol<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // 1) Método público de inserción (entrada desde fuera)
    public void insertar(T valor) {
        this.raiz = insertarRecursivo(this.raiz, valor);
    }

    // 2) Método recursivo privado que hace la lógica BST
    private NodoArbol<T> insertarRecursivo(NodoArbol<T> actual, T valor) {
        if (actual == null) {
            return new NodoArbol<>(valor); // caso base: crear nuevo nodo
        }

        int cmp = valor.compareTo(actual.getDato());
        if (cmp < 0) {
            actual.hijoIzquierdo = insertarRecursivo(actual.hijoIzquierdo, valor);
        } else if (cmp > 0) {
            actual.hijoDerecho = insertarRecursivo(actual.hijoDerecho, valor);
        } // si cmp == 0: duplicado -> lo ignoramos 

        return actual;
    }

    // Recorrido Inorden público
    public void recorrerInorden() {
        System.out.print("Recorrido Inorden: ");
        recorrerInordenRecursivo(this.raiz);
        System.out.println();
    }

    // Recorrido Inorden recursivo (izquierda, raíz, derecha)
    private void recorrerInordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.hijoIzquierdo);
            System.out.print(nodo.getDato() + " ");
            recorrerInordenRecursivo(nodo.hijoDerecho);
        }
    }

    // Método de búsqueda simple 
    public boolean buscar(T valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    private boolean buscarRecursivo(NodoArbol<T> nodo, T valor) {
        if (nodo == null) return false;
        int cmp = valor.compareTo(nodo.getDato());
        if (cmp == 0) return true;
        if (cmp < 0) return buscarRecursivo(nodo.hijoIzquierdo, valor);
        return buscarRecursivo(nodo.hijoDerecho, valor);
    }
}