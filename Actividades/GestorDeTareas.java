package Actividades;

import LinkedList.ListaEnlazada;
import LinkedList.MensajeException;

public class GestorDeTareas {
    private ListaEnlazada<Tarea> tareasPendientes;
    private ListaEnlazada<Tarea> tareasCompletadas;

    public GestorDeTareas(){
        tareasPendientes = new ListaEnlazada<>();
        tareasCompletadas = new ListaEnlazada<>();
    }

    //Agrega al final de la lista enlazada.
    public void agregarTarea(Tarea actividad) throws MensajeException {
        tareasPendientes.insertLast(actividad);
    }

    //Elimina la tarea si existe.
    public boolean eliminarTarea(Tarea actividad) throws MensajeException {
        tareasPendientes.removeNode(actividad);
        tareasCompletadas.removeNode(actividad);
        return true;
    }

    //Busca una tarea.
    public boolean contieneTarea(Tarea actividad) throws MensajeException {
        return tareasPendientes.search(actividad) != -1 || tareasCompletadas.search(actividad) != -1;
    }

    //Imprime todas las tareas.
    public void imprimirTareas() throws MensajeException {
        tareasPendientes.print();
    }

    //Cuenta el total de tareas.
    public int contarTareas() throws MensajeException {
        return tareasPendientes.length() + tareasCompletadas.length();
    }

    //Si se trabaja con objetos Tarea, devuelve la de mayor prioridad.
    public Tarea obtenerTareaMasPrioritaria(){

    }

    //Invierte la lista enlazada.
    public void invertirTareas() throws MensajeException {
        tareasPendientes.printInverso();
    }
}