package Actividades;

import Queue.ListaEnlazadaPrioridad;
import LinkedList.MensajeException;

public class GestorDeTareas {
    private ListaEnlazadaPrioridad<Tarea> tareasPendientes;
    private ListaEnlazadaPrioridad<Tarea> tareasCompletadas;

    public GestorDeTareas(){
        tareasPendientes = new ListaEnlazadaPrioridad<>();
        tareasCompletadas = new ListaEnlazadaPrioridad<>();
    }

    //Agrega al final de la lista enlazada.
    public void agregarTarea(Tarea actividad, int prioridad) throws MensajeException {
        tareasPendientes.insertLast(actividad, prioridad);
    }

    //Elimina la tarea si existe.
    public boolean eliminarTarea(Tarea actividad) throws MensajeException {
        if (tareasPendientes.length() > 0 && tareasPendientes.search(actividad) != -1) {
            tareasPendientes.removeNode(actividad);
        }

        if (tareasCompletadas.length() > 0 && tareasCompletadas.search(actividad) != -1) {
            tareasCompletadas.removeNode(actividad);
        }

        return true;
    }

    //Busca una tarea.
    public boolean contieneTarea(Tarea actividad) throws MensajeException {
        if (tareasPendientes.search(actividad) != -1 || tareasCompletadas.search(actividad) != -1){
            return true;
        }
        else{
            throw new MensajeException("No se encontró la tarea.");
        }
    }

    //Imprime todas las tareas.
    public void imprimirTareasPendientes() throws MensajeException {
        if (tareasPendientes.length() == 0) {
            System.out.println("[Lista de tareas completadas vacía]");
        } else {
        tareasPendientes.print();
        }
    }

    //Imprime todas las tareas.
    public void imprimirTareasCompletadas() throws MensajeException {
        if (tareasCompletadas.length() == 0) {
            System.out.println("[Lista de tareas completadas vacía]");
        } else {
            tareasCompletadas.print();
        }
    }

    //Imprime todas las tareas.
    public void imprimirTareas() throws MensajeException {
        System.out.println("Tareas Pendientes:");
        if (tareasPendientes.length() == 0) {
            System.out.println("[Lista de tareas pendientes vacía]");
        } else {
            tareasPendientes.print();
        }

        System.out.println("Tareas Completadas:");
        if (tareasCompletadas.length() == 0) {
            System.out.println("[Lista de tareas completadas vacía]");
        } else {
            tareasCompletadas.print();
        }
    }

    //Cuenta el total de tareas.
    public int contarTareas() throws MensajeException {
        return tareasPendientes.length() + tareasCompletadas.length();
    }

    //Si se trabaja con objetos Tarea, devuelve la de mayor prioridad.
    public Tarea obtenerTareaMasPrioritaria() throws MensajeException {
        return tareasPendientes.mayorPrioridad();
    }

    //Transferir un tarea de una lista a otra
    public void tranferirTarea(Tarea tarea) throws MensajeException {
        int posicion = tareasPendientes.search(tarea);
        if (posicion == -1) throw new MensajeException("Tarea no encontrada en pendientes.");

        Tarea tareaTemporal = tareasPendientes.searchK(posicion);
        tareasPendientes.removeNodeK(posicion);
        tareasCompletadas.insertLast(tareaTemporal, tareaTemporal.getPrioridad());
    }

    //Invierte la lista enlazada.
    public void invertirTareasPendientes() throws MensajeException {
        tareasPendientes.printInverso();
    }

    //Invierte la lista enlazada.
    public void invertirTareasCompletadas() throws MensajeException {
        tareasCompletadas.printInverso();
    }

    //Invierte la lista enlazada.
    public void invertirTareas() throws MensajeException {
        concatenarListas().printInverso();
    }

    public ListaEnlazadaPrioridad<Tarea> concatenarListas(){
        ListaEnlazadaPrioridad<Tarea> listaFinal = new ListaEnlazadaPrioridad<>();

        try {
            // Agregar tareas pendientes
            for (int i = 0; i < tareasPendientes.length(); i++) {
                Tarea tarea = tareasPendientes.searchK(i);
                listaFinal.insertLast(tarea, tarea.getPrioridad());
            }

            // Agregar tareas completadas
            for (int i = 0; i < tareasCompletadas.length(); i++) {
                Tarea tarea = tareasCompletadas.searchK(i);
                listaFinal.insertLast(tarea, tarea.getPrioridad());
            }
        } catch (MensajeException e) {
            e.printStackTrace();
        }

        return listaFinal;
    }

}