package Actividades;

public class Tarea {
    private String titulo;
    private int prioridad;

    public Tarea (String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }

    public String toString() {
        return "Tarea: " + this.titulo + ", Prioridad: " + this.prioridad;
    }

}
