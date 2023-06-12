/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.arboles_nodos;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Clase AB que implemente alguno de los metodos utilizados para arboles binarios,
 * ademas de implementar el CRUD, la clase esta generalizada para que pueda ser llamada
 * y crear un arbol de cualquier objeto, la unica restriccion es que la Key tiene que
 * implementar Comparable
 * @author JSMC
 */
public class AB <Key extends Comparable<Key>, Value>{
    Nodo raiz;
    private ArrayList<Object> lista = new ArrayList<Object>();

    
    private class Nodo {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Nodo hijoIzquierdo, hijoDerecho;  // arbol izquierdo y derecho
        private int size;          // numero de nodos en el subarbol

        public Nodo(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }
    /**
     * Inicializa un arbol vacio
     */
    public AB() {
        raiz = null;
    }

    /**
     * Inserta el par clave-valor especificado en la tabla de símbolos,
     * sobrescribiendo el valor antiguo con el nuevo valor si la tabla de 
     * símbolos ya contiene la clave especificada.
     * Elimina la clave especificada (y su valor asociado) de esta tabla de
     * símbolos si el valor especificado es {@code null}.
     * @param key
     * @param val 
     * @throws IllegalArgumentException si {@code key} es {@code null}
     */
    public void insertar(Key key, Value val) {
        if(key == null) throw new IllegalArgumentException("Intenta agregar con un valor nulo para key");
        if(val == null){
            eliminar(key);
            return;
        }
        raiz = insertar(raiz, key, val);
    }

    private Nodo insertar(Nodo nodo, Key key, Value val) {
        if (nodo == null) {
            nodo = new Nodo(key, val,1);
            return nodo;
        }

        int comparacion = key.compareTo(nodo.key);

        if (comparacion < 0) {
            nodo.hijoIzquierdo = insertar(nodo.hijoIzquierdo, key, val);
        } else if (comparacion > 0) {
            nodo.hijoDerecho = insertar(nodo.hijoDerecho, key, val);
        }
        else{
        
            nodo.val = val;
            
        }
        nodo.size = 1 +size(nodo.hijoIzquierdo)+size(nodo.hijoDerecho);

        return nodo;
    }

    /**
     * Retorna el valor asociado con la llave dada
     * 
     * @param key la key
     * @return el valor asociado con la llave dada si la llave esta en un simbolo
     *         de la tabla y (@code null) si la llave no es un sibolo en la tabla
     * @throws IllegalArgumentException si {@code key} es {@code null}
     */
    public Value buscar(Key key) {
        return buscar(raiz, key);
    }

    private Value buscar(Nodo nodo, Key key) {
        if (key == null) {
            throw new IllegalArgumentException("No se puede buscar con una llave nula");
        }
        if(nodo == null) return null;

        int comparacion = key.compareTo(nodo.key);

        if (comparacion < 0) {
            return buscar(nodo.hijoIzquierdo, key);
        } else if(comparacion > 0) {
            return buscar(nodo.hijoDerecho, key);
        }
        else{
            return nodo.val;
        }
    }
    
    /**
     * Retorna true si el simbolo de la tabla esta vacio.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    
    /**
     * Remueve la llave mas pequenia asociada al valor de la tabla
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMin() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
        raiz = deleteMin(raiz);
        assert check();
    }

    private Nodo deleteMin(Nodo nodo) {
        if (nodo.hijoIzquierdo == null) return nodo.hijoDerecho;
        nodo.hijoIzquierdo = deleteMin(nodo.hijoIzquierdo);
        nodo.size = size(nodo.hijoIzquierdo) + size(nodo.hijoDerecho) + 1;
        return nodo;
    }    

    /**
     * Elimina la llave especificada y su valor asociado de la tabla de simbolos
     * (si la llave esta en esta tabla de simbolos)
     * 
     * @param key la llave
     * @throws IllegalArgumentException si {@code key} es {@code null}
     */
    public void eliminar(Key key) {
        if(key == null) throw new IllegalArgumentException("Intenta eliminar con una llave nula");
        raiz =eliminar(raiz,key);
        assert check();
    }

    private Nodo eliminar(Nodo nodo, Key key) {
        if (nodo == null) {
            return null;
        }

        int comparacion = key.compareTo(nodo.key);

        if (comparacion < 0) {
            nodo.hijoIzquierdo = eliminar(nodo.hijoIzquierdo, key);
        } else if (comparacion > 0) {
            nodo.hijoDerecho = eliminar(nodo.hijoDerecho, key);
        } else {
            if(nodo.hijoDerecho == null) return nodo.hijoIzquierdo;
            if(nodo.hijoIzquierdo == null) return nodo.hijoDerecho;
            Nodo temp = nodo;
            nodo.hijoDerecho = deleteMin(temp.hijoDerecho);
            nodo.hijoIzquierdo = temp.hijoIzquierdo;
            
        }
        nodo.size = size(nodo.hijoIzquierdo)+size(nodo.hijoDerecho)+1;
        return nodo;
    }

    /**
     * Llena una lista con los datos que hay en el arbol
     */
    public void llenarLista() {
        
        llenarLista(raiz);
    }

    private void llenarLista(Nodo nodo) {
        if (nodo != null) {
            llenarLista(nodo.hijoIzquierdo);
            lista.add(nodo.val);
            llenarLista(nodo.hijoDerecho);
        }
    }
    
    public ArrayList<Object> getLista() {
        return lista;
    }
    


    public int size() {
        return size(raiz);
    }

    private int size(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        else return nodo.size;
    }

    public boolean estaVacio() {
        return raiz == null;
    }
    
    /*************************************************************************
    *  Check integrity of BST data structure.
    ***************************************************************************/
    private boolean check() {
        if (!isBST())            System.out.println("Not in symmetric order");
        if (!isSizeConsistent()) System.out.println("Subtree counts not consistent");
        if (!isRankConsistent()) System.out.println("Ranks not consistent");
        return isBST() && isSizeConsistent() && isRankConsistent();
    }

    // does this binary tree satisfy symmetric order?
    // Note: this test also ensures that data structure is a binary tree since order is strict
    private boolean isBST() {
        return isBST(raiz, null, null);
    }

    // is the tree rooted at x a BST with all keys strictly between min and max
    // (if min or max is null, treat as empty constraint)
    // Credit: elegant solution due to Bob Dondero
    private boolean isBST(Nodo x, Key min, Key max) {
        if (x == null) return true;
        if (min != null && x.key.compareTo(min) <= 0) return false;
        if (max != null && x.key.compareTo(max) >= 0) return false;
        return isBST(x.hijoIzquierdo, min, x.key) && isBST(x.hijoDerecho, x.key, max);
    }

    // are the size fields correct?
    private boolean isSizeConsistent() { return isSizeConsistent(raiz); }
    private boolean isSizeConsistent(Nodo x) {
        if (x == null) return true;
        if (x.size != size(x.hijoIzquierdo) + size(x.hijoDerecho) + 1) return false;
        return isSizeConsistent(x.hijoIzquierdo) && isSizeConsistent(x.hijoDerecho);
    }

    // check that ranks are consistent
    private boolean isRankConsistent() {
        for (int i = 0; i < size(); i++)
            if (i != rank(select(i))) return false;
        for (Key key : keys())
            if (key.compareTo(select(rank(key))) != 0) return false;
        return true;
    }
    
    
     /**
     * Return the key in the symbol table of a given {@code rank}.
     * This key has the property that there are {@code rank} keys in
     * the symbol table that are smaller. In other words, this key is the
     * ({@code rank}+1)st smallest key in the symbol table.
     *
     * @param  rank the order statistic
     * @return the key in the symbol table of given {@code rank}
     * @throws IllegalArgumentException unless {@code rank} is between 0 and
     *        <em>n</em>–1
     */
    public Key select(int rank) {
        if (rank < 0 || rank >= size()) {
            throw new IllegalArgumentException("argument to select() is invalid: " + rank);
        }
        return select(raiz, rank);
    }

    // Return key in BST rooted at x of given rank.
    // Precondition: rank is in legal range.
    private Key select(Nodo x, int rank) {
        if (x == null) return null;
        int leftSize = size(x.hijoIzquierdo);
        if      (leftSize > rank) return select(x.hijoIzquierdo,  rank);
        else if (leftSize < rank) return select(x.hijoDerecho, rank - leftSize - 1);
        else                      return x.key;
    }
    
    /**
     * Return the number of keys in the symbol table strictly less than {@code key}.
     *
     * @param  key the key
     * @return the number of keys in the symbol table strictly less than {@code key}
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public int rank(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to rank() is null");
        return rank(key, raiz);
    }

    // Number of keys in the subtree less than key.
    private int rank(Key key, Nodo x) {
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return rank(key, x.hijoIzquierdo);
        else if (cmp > 0) return 1 + size(x.hijoIzquierdo) + rank(key, x.hijoDerecho);
        else              return size(x.hijoIzquierdo);
    }
    
    /**
     * Returns all keys in the symbol table in ascending order,
     * as an {@code Iterable}.
     * To iterate over all of the keys in the symbol table named {@code st},
     * use the foreach notation: {@code for (Key key : st.keys())}.
     *
     * @return all keys in the symbol table in ascending order
     */
    public Iterable<Key> keys() {
        if (isEmpty()) return new Queue<Key>();
        return keys(min(), max());
    }

    /**
     * Returns all keys in the symbol table in the given range
     * in ascending order, as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo}
     *         (inclusive) and {@code hi} (inclusive) in ascending order
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null) throw new IllegalArgumentException("first argument to keys() is null");
        if (hi == null) throw new IllegalArgumentException("second argument to keys() is null");

        Queue<Key> queue = new Queue<Key>();
        keys(raiz, queue, lo, hi);
        return queue;
    }

    private void keys(Nodo x, Queue<Key> queue, Key lo, Key hi) {
        if (x == null) return;
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key);
        if (cmplo < 0) keys(x.hijoIzquierdo, queue, lo, hi);
        if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key);
        if (cmphi > 0) keys(x.hijoDerecho, queue, lo, hi);
    }
    
    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("calls min() with empty symbol table");
        return min(raiz).key;
    }

    private Nodo min(Nodo x) {
        if (x.hijoIzquierdo == null) return x;
        else                return min(x.hijoIzquierdo);
    }

    /**
     * Returns the largest key in the symbol table.
     *
     * @return the largest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key max() {
        if (isEmpty()) throw new NoSuchElementException("calls max() with empty symbol table");
        return max(raiz).key;
    }

    private Nodo max(Nodo x) {
        if (x.hijoDerecho == null) return x;
        else                 return max(x.hijoDerecho);
    }
}