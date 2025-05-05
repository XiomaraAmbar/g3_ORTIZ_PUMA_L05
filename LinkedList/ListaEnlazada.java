package LinkedList;

import LinkedList.Nodo;

public class ListaEnlazada<E>{ //Hereda de la clase Nodo
    private Nodo<E> primero; //Se crea la variable primero de tipo Nodo
    private Nodo<E> nodoTemporal; //Se crea la variable nodoTemporal de tipo Nodo

    public ListaEnlazada(){ //La lista comienza vacía
        primero = null;
    }

    //Determina si la lista esta vacía
    public boolean isEmpty(){
        return primero == null; //Retorna true si esta vacía
    }

    //Determina la longitud de elementos de la lista (el tamaño)
    public int length(){
        int contador = 0; //Se crea una variable contador que cuente la cantidad de nodos
        nodoTemporal = primero; //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            nodoTemporal = nodoTemporal.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            contador = contador + 1; //Y el contador se incrementa en uno
        }
        return contador; //Cuando se llega al ultimo nodo de la lista imprime el total
    }

    //Elimina los elementos de la lista dejandola vacía
    public void destroyList(){
        primero = null; //El primero es igual a null
    }

    //Verifica si el elemento x está en la lista y retorna su posición
    public int search(E valor){
        int posicion = 0; //Se crea una variable posicion que cuente la posicion del nodo
        nodoTemporal = primero; //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            if (nodoTemporal.getValor().equals(valor)){ //Si el valor del nodoTemporal es igual al valor que se busca
                return posicion; //Retorna la posicion del nodo si son iguales
            }
            nodoTemporal = nodoTemporal.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            posicion = posicion + 1; //La posicion aumenta en uno
        }
        return -1;//Caso contrario retorna -1, no se encontro el elemento o  el nodo
    }

    //Busca el k-ésimo elemento
    public E searchK(int k){
        int posicionK = 0; //Se crea una variable posicion que cuente la cantidad de nodos
        nodoTemporal = primero; //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            if (posicionK == k){ //Compara la posicion actual del nodoTemporal con k
                return nodoTemporal.getValor(); //Retorna el valor del nodoTemporal o del nodo en la posicion K
            }
            nodoTemporal = nodoTemporal.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            posicionK = posicionK + 1; //Y  posicion se incrementa en uno
        }
        return null;
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
