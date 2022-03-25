/**
 * Created by NAN7 on 1/30/2022.
 */
public interface Queue <E> {
    boolean isEmpty();
    int size();
    void enQueue (E element);
    E dequeue();
    E front ();
}
