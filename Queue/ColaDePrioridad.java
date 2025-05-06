package Queue;

import LinkedList.ListaEnlazadaSinExcepciones;
import LinkedList.Nodo;

public class ColaDePrioridad<E> {
    private ListaEnlazadaSinExcepciones<NodoPrioridad<String>> colaPrioridad;

    public ColaDePrioridad(){
        colaPrioridad = new ListaEnlazadaSinExcepciones<>();
    }

    //Verifica si la cola esta vacía
    public boolean isEmpty(){
        return colaPrioridad.isEmpty();
    }

    //Agrega el elemento x al final de la cola
    public void enqueue(E elemento, int prioridad){
        NodoPrioridad<E> nuevoNodo = new NodoPrioridad<>(elemento, prioridad);
        Nodo<E> nodo = nuevoNodo;
        if (isEmpty()){
            colaPrioridad.insertFirst(nuevoNodo);
        }
        else{

        }
        NodoPrioridad<E> nuevoNodo = new NodoPrioridad<>(elemento, prioridad);
        colaPrioridad.insertLast(elemento);

    }

    //Retorna el elemento que se ubica al inicio de la cola(desencolar)
    public E dequeue(){
        E primero = front();
        cola.removeNodeK(0);
        return primero;
    }

    //Retorna el elemento inicial de la cola
    public E front(){
        return cola.searchK(0);
    }

    //Retorna el elemento final de la cola
    public E back(){
        return cola.searchK(cola.length()-1);
    }

    //Imprime la pila
    public void print(){
        cola.print();
    }
}
