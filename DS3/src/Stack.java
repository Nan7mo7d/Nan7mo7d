/**
 * Created by NAN7 on 1/23/2022.
 */
public interface Stack<E> {
    //<E> as a data type (generic)
    boolean isEmpty();
    int size();
    E top();
    void push( E element);
    E pop ();
}

