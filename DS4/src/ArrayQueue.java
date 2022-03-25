
/**
 * Created by NAN7 on 1/30/2022.
 */
public class ArrayQueue <E> implements Queue<E> {
    E[]data;
    int f=0;
    int rear=0;
    static final int CAPACITY=100;

    public ArrayQueue (int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }


    @Override
    public boolean isEmpty() {
        return rear==0;
    }

    @Override
    public int size() {
        return rear;
    }

    @Override
    public void enQueue(E element) {
        if (size()==data.length)
            throw new IllegalStateException("QUEUE IS FULL!");
        int index =(f+rear)%data.length;
        data[index]=element;
        rear++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E x=data [f];
        data [f]=null;
        f= (f+1)%data.length;
        rear--;
        return x;


    }

    @Override
    public E front() {
        if (isEmpty()) return null;
        return data[f];
    }
}
