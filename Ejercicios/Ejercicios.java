package Ejercicios;

import LinkedList.ListaEnlazada;
import LinkedList.MensajeException;
import LinkedList.Nodo;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios<E> {

    // 1. Buscar un elemento genérico en una lista (tipo ArrayList)
    public static <E> boolean buscarElemento(List<E> lista, E valor) {
        for (E elemento : lista) {
            if (elemento.equals(valor)) {
                return true;
            }
        }
        return false;
    }

    // 2. Invertir una lista genérica (tipo ArrayList)
    public static <E> List<E> invertirLista(List<E> lista) {
        List<E> listaInvertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }
        return listaInvertida;
    }

    ListaEnlazada<E> lista = new ListaEnlazada<E>();

    // 3. Insertar un nodo al final de una lista enlazada
    public void insertarAlFinal(E valor) throws MensajeException {
        lista.insertLast(valor);
    }

    // 4. Contar los nodos de una lista enlazada
    public int contarNodos() throws MensajeException {
        return lista.length();
    }

    // 5. Comparar dos listas enlazadas
    public static <E> boolean sonIguales(Nodo<E> cabecera1, Nodo<E> cabecera2) {
        Nodo<E> nodoTemporal1 = cabecera1;
        Nodo<E> nodoTemporal2 = cabecera2;

        while (nodoTemporal1 != null && nodoTemporal2 != null) {
            if (!nodoTemporal1.getValor().equals(nodoTemporal2.getValor())) {
                return false;
            }
            nodoTemporal1 = nodoTemporal1.getSiguiente();
            nodoTemporal2 = nodoTemporal2.getSiguiente();
        }

        return nodoTemporal1 == null && nodoTemporal2 == null;
    }

    // 6. Concatenar dos listas enlazadas
    public static <E> Nodo<E> concatenarListas(Nodo<E> cabecera1, Nodo<E> cabecera2) {
        if (cabecera1 == null) return cabecera2;
        Nodo<E> nodoTemporal = cabecera1;
        while (nodoTemporal.getSiguiente() != null) {
            nodoTemporal = nodoTemporal.getSiguiente();
        }
        nodoTemporal.setSiguiente(cabecera2);
        return cabecera1;
    }
}
