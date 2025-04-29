public class Nodo<E> {
    private E valor; //Información del nodo
    private Nodo<E> siguiente; //Referencia al siguiente nodo

    //Constructor que inicializa la información del nodo con su valor y la referencia del
    //siguiente apunta a null
    public Nodo(E valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public E getValor(){
        return valor;
    }

    public void setValor(E valor){
        this.valor = valor;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}
