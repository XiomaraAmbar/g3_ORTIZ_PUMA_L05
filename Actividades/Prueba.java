package Actividades;

public class Prueba {
    public static void main(String[] args) {
        try {
            // Paso 1: Crear instancia de GestorDeTareas
            GestorDeTareas gestor = new GestorDeTareas();

            // Paso 2: Agregar tareas
            Tarea tarea1 = new Tarea("Llamar al encargado", 2);
            Tarea tarea2 = new Tarea("Ir a la municipalidad", 1);
            Tarea tarea3 = new Tarea("Diseñar material educativo", 3);

            gestor.agregarTarea(tarea1, tarea1.getPrioridad());
            gestor.agregarTarea(tarea2, tarea2.getPrioridad());
            gestor.agregarTarea(tarea3, tarea3.getPrioridad());

            gestor.imprimirTareas();

            // Paso 3: Eliminar alguna
            gestor.eliminarTarea(tarea2); // eliminamos la tarea de ir a la municipalidad

            gestor.imprimirTareas();

            // Paso 4: Imprimir todas las tareas actuales
            System.out.println("Tareas pendientes:");
            gestor.imprimirTareasPendientes();

            // Paso 5: Verificar si cierta tarea existe
            boolean existe = gestor.contieneTarea(new Tarea("Diseñar material educativo", 3));
            System.out.println("¿Existe la tarea 'Diseñar material educativo'? " + existe);

            // Paso 6: Invertir la lista combinada
            System.out.println("Lista invertida (pendientes + completadas):");
            gestor.invertirTareas();

            // Paso 7: Transferir una tarea a completadas
            gestor.agregarTarea(tarea2, 1); // volvemos a agregar para probar
            gestor.tranferirTarea(tarea2);  // transferimos la tarea

            // Paso 8: Mostrar ambas listas por separado
            System.out.println("Tareas pendientes:");
            gestor.imprimirTareasPendientes();

            System.out.println("Tareas completadas:");
            gestor.imprimirTareasCompletadas();

            // Paso 9: Mostrar lista concatenada
            System.out.println("Todas las tareas combinadas (pendientes + completadas):");
            gestor.concatenarListas().print();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
