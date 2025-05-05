package LinkedList;

//Interface Lista TDA
public interface ListaTDA<E>{

    boolean isEmpty(); //Método que determina si la lista esta vacía
    int length(); //Método que determina la longitud de elementos de la lista (el tamaño)
    void destroyList(); //Método que elimina los elementos de la lista dejandola vacía
    int search(); //Método que verifica si el elemento x está en la lista y retorna su posición
    E searchK(); //Método que busca el k-ésimo elemento
    void insertFirst(); //Método que inserta el nuevo nodo al inicio de la lista
    void insertLast(); //Método que inserta el nuevo nodo al final de la lista
    void removeNode(); //Método que elimina un nodo de la lista enlazada
}
