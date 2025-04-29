//public class ListaEnlazada<E> implements ListaTDA<E>{
public class ListaEnlazada<E extends Nodo<E>>{
    private Nodo<E> lista;
    private int longitud;

    public ListaEnlazada(){
        lista = null;
        longitud = 0;
    }

    //Método que determina si la lista esta vacía
    public boolean isEmpty(){
        if (longitud != 0){

        }
    }
}
