/**
 * Created by NAN7 on 2/20/2022.
 */
public interface Queue<E>  {
    boolean isEmpty();
    int size();
    void enqueue (E element);
    E dequeue();
    E first ();
}
