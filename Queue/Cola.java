package Queue;

import LinkedList.ListaEnlazadaSinExcepciones;

public class Cola<E> {
    private ListaEnlazadaSinExcepciones<E> cola;

    public Cola(){
        cola = new ListaEnlazadaSinExcepciones<>();
    }

    //Verifica si la cola esta vacía
    public boolean isEmpty(){
        return cola.isEmpty();
    }

    //Agrega el elemento x al final de la cola
    public void enqueue(E elemento){
        if (isEmpty()){
            cola.insertFirst(elemento);
        }
        else{
            cola.insertLast(elemento);
        }
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
