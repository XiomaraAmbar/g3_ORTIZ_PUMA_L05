package Queue;

import LinkedList.Nodo;

public class NodoPrioridad<E>{
    private E valor; //Valor del nodo
    private int peso; //Peso del nodo

    public NodoPrioridad(E valor, int peso){
        this.valor = valor;
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int nuevoPeso){
        this.peso = nuevoPeso;
    }

    public String toString() {
        return "(" + valor + ", " + peso + ")";
    }
}
