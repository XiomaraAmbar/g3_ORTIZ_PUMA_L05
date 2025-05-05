package LinkedList;

import LinkedList.Nodo;

public class ListaEnlazada<E extends Nodo<E>>{ //Hereda de la clase Nodo
    private Nodo<E> primero; //Se crea la variable primero de tipo Nodo
    private Nodo<E> ultimo; //Se crea la variable ultimo de tipo Nodo
    private Nodo<E> nodoTemporal; //Se crea la variable nodoTemporal de tipo Nodo

    public ListaEnlazada(){ //La lista comienza vacía
        ultimo.setSiguiente(null);
    }

    //Determina si la lista esta vacía
    public boolean isEmpty(){
        if (primero.getSiguiente() == null){ return true; } //Si esta vacía devuelve true
        return false; //Caso contrario, si no esta vacía, devuelve false
    }

    //Determina la longitud de elementos de la lista (el tamaño)
    public int length(){
        int contador = 0; //Se crea una variable contador que cuente la cantidad de nodos
        nodoTemporal = primero; //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(isEmpty() != true){ //Ciclo que verifica si la lista no este vacía
            nodoTemporal = primero.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            contador = contador + 1; //Y el contador se incrementa en uno
        }
        return contador; //Cuando
    }

    //Método que elimina los elementos de la lista dejandola vacía
    public void destroyList(){

    }

    //Método que verifica si el elemento x está en la lista y retorna su posición
    public int search(){

    }

    //Método que busca el k-ésimo elemento
    public E searchK(){

    }

    //Método que inserta el nuevo nodo al inicio de la lista
    public void insertFirst(){

    }

    //Método que inserta el nuevo nodo al final de la lista
    public void insertLast(){

    }

    //Método que elimina un nodo de la lista enlazada
    public void removeNode(){

    }

    //Método que imprime la lista
    public void print(){

    }
}
