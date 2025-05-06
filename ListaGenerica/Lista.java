package ListaGenerica;

import LinkedList.ListaTDA;
import LinkedList.MensajeException;

public class Lista<E> implements ListaTDA<E> {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public void destroyList() {

    }

    @Override
    public int search(E valor) throws MensajeException {
        return 0;
    }

    @Override
    public E searchK(int k) throws MensajeException {
        return null;
    }

    @Override
    public void insertFirst(E valor) {

    }

    @Override
    public void insertLast(E valor) throws MensajeException {

    }

    @Override
    public void removeNode(E valor) throws MensajeException {

    }
}
