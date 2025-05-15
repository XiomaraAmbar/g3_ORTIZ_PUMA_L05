package Ejercicios;

import LinkedList.ListaEnlazada;
import LinkedList.MensajeException;
import LinkedList.Nodo;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) throws MensajeException {
        // 1. Prueba de buscarElemento
        List<String> arrayList = new ArrayList<>();
        arrayList.add("perro");
        arrayList.add("gato");
        arrayList.add("loro");

        boolean encontrado = Ejercicios.buscarElemento(arrayList, "gato");
        System.out.println("¿Está 'gato'? " + encontrado); // true

        // 2. Prueba de invertirLista
        List<String> invertida = Ejercicios.invertirLista(arrayList);
        System.out.println("Lista invertida: " + invertida); // [loro, gato, perro]

        // 3. Insertar nodos y contar
        Ejercicios<String> ejercicios = new Ejercicios<String>();
        ejercicios.insertarAlFinal("uno");
        ejercicios.insertarAlFinal("dos");
        ejercicios.insertarAlFinal("tres");

        int cantidad = ejercicios.contarNodos();
        System.out.println("Cantidad de nodos: " + cantidad); // 3

        // 5. Comparar dos listas
        Nodo<String> nodo1 = new Nodo<>("A");
        Nodo<String> nodo2 = new Nodo<>("B");
        Nodo<String> nodo3 = new Nodo<>("C");
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);

        Nodo<String> nodo4 = new Nodo<>("A");
        Nodo<String> nodo5 = new Nodo<>("B");
        Nodo<String> nodo6 = new Nodo<>("C");
        nodo4.setSiguiente(nodo5);
        nodo5.setSiguiente(nodo6);

        boolean iguales = Ejercicios.sonIguales(nodo1, nodo4);
        System.out.println("¿Son iguales? " + iguales); // true

        // 6. Concatenar listas
        Nodo<String> concatenada = Ejercicios.concatenarListas(nodo1, nodo4);
        Nodo<String> nodoTemporal = concatenada;
        System.out.print("Lista concatenada: ");
        while (nodoTemporal != null) {
            System.out.print(nodoTemporal.getValor() + " ");
            nodoTemporal = nodoTemporal.getSiguiente();
        }
        System.out.println();
    }
}
