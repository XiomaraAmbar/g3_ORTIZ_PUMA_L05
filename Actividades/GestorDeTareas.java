package Actividades;

import LinkedList.ListaEnlazadaSinExcepciones;

public class GestorDeTareas {
    private ListaEnlazadaSinExcepciones<Tarea> tareasPendientes;
    private ListaEnlazadaSinExcepciones<Tarea> tareasCompletadas;

    public GestorDeTareas(){
        tareasPendientes = new ListaEnlazadaSinExcepciones<>();
        tareasCompletadas = new ListaEnlazadaSinExcepciones<>();
    }

    //Agrega al final de la lista enlazada.
    public void agregarTarea(Tarea actividad) {
        tareasPendientes.insertLast(actividad);
    }

    //Elimina la tarea si existe.
    public boolean eliminarTarea(Tarea actividad){
        tareasPendientes.removeNode(actividad);
        tareasCompletadas.removeNode(actividad);
        return true;
    }

    //Busca una tarea.
    public boolean contieneTarea(Tarea actividad){
        return tareasPendientes.search(actividad) != -1 || tareasCompletadas.search(actividad) != -1;
    }

    //Imprime todas las tareas.
    public void imprimirTareas(){
        tareasPendientes.print();
    }

    //Cuenta el total de tareas.
    public int contarTareas(){
        return tareasPendientes.length() + tareasCompletadas.length();
    }

    //Si se trabaja con objetos Tarea, devuelve la de mayor prioridad.
    public Tarea obtenerTareaMasPrioritaria(){

    }

    //Invierte la lista enlazada.
    public void invertirTareas(){
        tareasPendientes.printInvertido();
    }
}