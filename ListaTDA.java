//Interface Lista TDA
public interface ListaTDA <E>{

    public boolean isEmpty(); //Método que determina si la lista esta vacía

    public int length(); //Método que determina la longitud de elementos de la lista (el tamaño)

    public void destroyList(); //Método que elimina los elementos de la lista dejandola vacía

    public int search(); //Método que verifica si el elemento x está en la lista y retorna su posición

    public int searchK(); //Método que busca el k-ésimo elemento

    public void insertFirst(); //Método que inserta el nuevo nodo al inicio de la lista

    public void insertLast(); //Método que inserta el nuevo nodo al final de la lista

    public void removeNode(); //Método que elimina un nodo de la lista enlazada
}
