import jdk.nashorn.internal.objects.NativeObject;

/**
 * Created by NAN7 on 2/27/2022.
 */
public class DoubleLinkedList <E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size=0;

    public DoubleLinkedList() {
        header =new Node<E>( null,null,null);
        //(element,prev,next)
        trailer =new Node<E>(null,header,null);
        header.setNext(trailer);
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }
    public E last(){
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    private void addBetween(E el, Node<E>p, Node<E>n)
    {
        Node<E> newest=new Node<E>(el,p,n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }

    public void addFirst(E el){
        addBetween(el,header,header.getNext());
    }

    public void addLast(E el){
        addBetween(el,trailer.getPrev(),trailer);
    }

    private E remove(Node<E> x) {
        Node<E> p = x.getPrev();
        Node<E> n = x.getNext();
        p.setNext(n);
        p.setPrev(p);
        size--;
        return x.getElement();
    }

     public E removeFirst(){
         if (isEmpty()) return null;
         return  remove(header.getNext());
     }
    public E removeLast(){
        if (isEmpty()) return null;
        return  remove(trailer.getPrev());
    }





    private static class Node <E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    }

