package LinkedList;

public class ListaEnlazadaCabecera<E extends Nodo<E>>{ //Hereda de la clase Nodo
    private Nodo<E> cabecera; //Se crea la variable cabecera de tipo Nodo
    private Nodo<E> nodoTemporal; //Se crea la variable nodoTemporal de tipo Nodo

    public ListaEnlazadaCabecera(){ //La lista comienza vacía
        cabecera = new Nodo<E>(null);
        cabecera.setSiguiente(null);
    }

    //Determina si la lista esta vacía
    public boolean isEmpty(){
        return cabecera.getSiguiente() == null; //Retorna true si esta vacía
    }

    //Determina la longitud de elementos de la lista (el tamaño)
    public int length(){
        int contador = 0; //Se crea una variable contador que cuente la cantidad de nodos
        nodoTemporal = cabecera.getSiguiente(); //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            nodoTemporal = nodoTemporal.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            contador = contador + 1; //Y el contador se incrementa en uno
        }
        return contador; //Cuando se llega al ultimo nodo de la lista imprime el total
    }

    //Elimina los elementos de la lista dejandola vacía
    public void destroyList(){
        cabecera.setSiguiente(null);//La cabecera apunta a null
    }

    //Verifica si el elemento x está en la lista y retorna su posición
    public int search(E valor) throws MensajeException{
        if (cabecera.getSiguiente() == null){ //Verifica si la lista esta vacía
            //Si esta vacía lanza una excepción
            throw new MensajeException("Lista enlazada vacía, no hay elementos.");
        }
        int posicion = 0; //Se crea una variable posicion que cuente la posicion del nodo
        nodoTemporal = cabecera.getSiguiente(); //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            if (nodoTemporal.getValor().equals(valor)){ //Si el valor del nodoTemporal es igual al valor que se busca
                return posicion; //Retorna la posicion del nodo si son iguales
            }
            nodoTemporal = nodoTemporal.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            posicion = posicion + 1; //La posicion aumenta en uno
        }
        throw new MensajeException("No se encontró el valor en la lista enlazada.");
        //return -1;//Caso contrario retorna -1, no se encontro el elemento o  el nodo
    }

    //Busca el k-ésimo elemento por su posición y retorna el nodo (valor)
    public E searchK(int k) throws MensajeException{
        if (cabecera.getSiguiente() == null){ //Verifica si la lista esta vacía
            //Si esta vacía lanza una excepción
            throw new MensajeException("Lista enlazada vacía, no hay elementos.");
        }
        int posicionK = 0; //Se crea una variable posicion que cuente la cantidad de nodos
        nodoTemporal = cabecera.getSiguiente(); //Se asigna el valor del primer nodo a la variable nodoTemporal
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            if (posicionK == k){ //Compara la posicion actual del nodoTemporal con k
                return nodoTemporal.getValor(); //Retorna el valor del nodoTemporal o del nodo en la posicion K
            }
            nodoTemporal = nodoTemporal.getSiguiente(); //NodoTemporal ahora tiene el valor del siguiente nodo
            posicionK = posicionK + 1; //Y  posicion se incrementa en uno
        }
        throw new MensajeException("No se encontró el valor en la lista enlazada.");
        //return null;
    }

    //Inserta el nuevo nodo al inicio de la lista
    public void insertFirst(E nuevo){
        Nodo<E> nuevoNodo = new Nodo<E> (nuevo); //Se crea un nuevo nodo con el valor del nuevo elemento
        nuevoNodo.setSiguiente(cabecera.getSiguiente()); // El nuevo nodo apunta al siguiente de cabecera
        cabecera.setSiguiente(nuevoNodo); //Y la cabecera apunta al nuevo nodo
    }

    //Inserta el nuevo nodo a una posicion x en la lista
    public void insertPosicionK(E nuevo, int posicionK) throws MensajeException{
        Nodo<E> nuevoNodo = new Nodo<E> (nuevo); //Se crea un nuevo nodo con el valor del nuevo elemento
        Nodo<E> nodoAnterior = searchK(posicionK-1); //El nodo anterior es el nodo anterior al nodo del medio
        Nodo<E> nodoMedio = searchK(posicionK); //El nodo del medio se refiere a el nodo el cual se desplazara de su posición
        if (cabecera.getSiguiente() == null){ //Si la lista esta vacía
            insertFirst(nuevo); //Se inserta el nuevo nodo al inicio
        }
        else{ //Caso contrario
            nuevoNodo.setSiguiente(nodoMedio); //El nuevo nodo apuntara al nodo medio (nodo desplazado)
            nodoAnterior.setSiguiente(nuevoNodo); //El nodo anterior apuntara al nuevo nodo
        }
    }

    //Inserta el nuevo nodo al final de la lista
    public void insertLast(E nuevo) throws MensajeException{
        Nodo<E> nuevoNodo = new Nodo<E> (nuevo); //Se crea un nuevo nodo con el nuevo elemento
        nuevoNodo.setSiguiente(null); //El siguiente del nuevo nodo apunta a null
        if (cabecera.getSiguiente() == null){ //Si la lista esta vacía
            //nuevoNodo.setSiguiente(null);
            cabecera.setSiguiente(nuevoNodo); //La cabecera apunta al nuevo nodo
        }
        else{ //Caso contrario la lista no este vacía
            //nuevoNodo.setSiguiente(null);
            Nodo<E> nodoAnterior = searchK(length()-1);//El nodo anterior sera el nodo que tenga la ultima posicion de la lista
            nodoAnterior.setSiguiente(nuevoNodo); //Y el anterior nodo ultimo apunta al nuevo nodo
        }
    }

    //Elimina un nodo de la lista enlazada por contenido (valor)
    public void removeNode(E nodo) throws MensajeException{
        if (cabecera.getSiguiente() == null){ //Verifica si la lista esta vacía
            //Si esta vacía lanza una excepción
            throw new MensajeException("Lista enlazada vacía, no hay elementos que eliminar.");
        }
        int posicionNodo = search(nodo); //La variable posicionNodo sera la posicion del nodo a eliminar en la lista
        Nodo<E> nodoEliminado = searchK(posicionNodo); //nodoEliminado es el nodo en la posicion del nodo que se quiere eliminar
        Nodo<E> nodoAnterior = searchK(posicionNodo-1); //El nodo anterior es el nodo anterior que apunta al nodo que se quiere eliminar
        nodoAnterior.setSiguiente(nodoEliminado.getSiguiente()); //El nodo anterior al nodo eliminado apunta al siguiente del nodo eliminado
    }

    //Elimina un nodo de la lista enlazada por posición
    public void removeNodeK(int posicionK) throws MensajeException{
        if (cabecera.getSiguiente() == null){ //Verifica si la lista esta vacía
            //Si esta vacía lanza una excepción
            throw new MensajeException("Lista enlazada vacía, no hay elementos que eliminar.");
        }
        Nodo<E> nodoEliminado = searchK(posicionK); //nodoEliminado es el nodo en la posicion del nodo que se quiere eliminar
        Nodo<E> nodoAnterior = searchK(posicionK-1); //El nodo anterior es el nodo anterior que apunta al nodo que se quiere eliminar
        nodoAnterior.setSiguiente(nodoEliminado.getSiguiente()); //El nodo anterior al nodo eliminado apunta al siguiente del nodo eliminado
    }

    //Imprime la lista enlazada
    public void print(Nodo<E> cabecera) throws MensajeException{
        nodoTemporal = cabecera.getSiguiente(); //Se asigna el valor del primer nodo a la variable nodoTemporal
        if (cabecera.getSiguiente() == null){ //Si la lista esta vacía
            throw new MensajeException("Lista vacía, no se puede imprimir nada."); //Lanza un mensaje
        }
        while(nodoTemporal != null){ //Ciclo que verifica que no se termino de recorrer la lista
            System.out.println(nodoTemporal.getValor()); //Imprime el valor del nodo actual llamado nodoTemporal
            nodoTemporal = nodoTemporal.getSiguiente(); //Y el nodo actual pasa a tener el valor del siguiente del nodo actual
        }
    }
}