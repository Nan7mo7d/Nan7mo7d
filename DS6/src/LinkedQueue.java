
/**
 * Created by NAN7 on 2/20/2022.
 */
public class LinkedQueue<E> implements Queue<E> {
    SinglyLinkedList<E> l=new SinglyLinkedList<E>();


    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public void enqueue(E element) {
        l.addLast(element);

    }

    @Override
    public E dequeue() {
        return l.removeFirst();
    }

    @Override
    public E first() {
        return l.first();
    }
}
