import java.util.IllegalFormatCodePointException;

/**
 * Created by NAN7 on 1/23/2022.
 */
public class ArrayStack<E> implements Stack<E> {
   static final int CAPACITY=100;
    E data [];
    int t=-1;

    public ArrayStack (int c){
        data=(E[])new Object[c];
        //useer enter capacity

    }

    public ArrayStack(){
        this(CAPACITY);
        //already known capacity

    }

    @Override
    public boolean isEmpty()
    {
        return t==-1;
    }

    @Override
    public int size()
    {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
        throw new IllegalStateException("Stack is full!");
                    data[++t]=element;
        //or t++
        //data[t]=element
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        //or if(t==-1)
        E deleted=data [t];
        data[t]=null;
        t--;
        return deleted;
    }
}