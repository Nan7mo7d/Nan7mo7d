/**
 * Created by NAN7 on 2/20/2022.
 */
    public interface Stack<E> {
        boolean isEmpty();
        int size();
        E top();
        void push(E element);
        E pop();
    }

