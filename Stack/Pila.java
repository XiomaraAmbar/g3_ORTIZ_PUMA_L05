package Stack;

import LinkedList.ListaEnlazadaSinExcepciones;

public class Pila<E>{

    private ListaEnlazadaSinExcepciones<E> pila;

    public Pila(){
        pila = new ListaEnlazadaSinExcepciones<>();
    }

    //Verifica si la pila esta vacía
    public boolean isEmpty(){
        return pila.isEmpty();
    }

    //Agrega el elemento x al tope de la pila
    public void push(E elemento){
        if (isEmpty()){
            pila.insertFirst(elemento);
        }
        else{
            pila.insertLast(elemento);
        }
    }

    //Elimina el elemento del tope y lo retorna
    public E pop(){
        E antesTop = top();
        pila.removeNodeK(pila.length()-1);
        return antesTop;
    }

    //Retorna el último elemento sin eliminarlo (tope) -> valor
    public E top(){
        return pila.searchK(pila.length()-1);
        //return pila.search(pila.searchK(pila.length()-1));
    }

    //Muestra el elemento del tope sin eliminarlo -> muestra el valor del top
    public void peek(){
        top();
        //return pila.searchK(pila.length()-1);
        //return pila.search(pila.searchK(pila.length()-1));
    }

    //Imprime la pila
    public void print(){
        pila.print();
    }
}
