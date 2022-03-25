/**
 * Created by NAN7 on 3/20/2022.
 */
public class BinaryTree<E> {
    private Node<E> root=null;
    private int size=0;
    public boolean isEmpty(){
        return size==0;
    }
    public int size (){
        return size;
    }

    protected Node<E> createNode (E e, Node<E> p, Node<E> l, Node<E>r)
    {
        return new Node<E>(e,p,r,l);
    }
    protected Node<E> validate(Position<E> p){
        if (!(p instanceof Node))
            throw  new IllegalArgumentException("P IS NOT A VALID POSITION");
        Node<E> n= (Node<E>) p;
        if (n.getParent()==n)
            throw new IllegalArgumentException("P IS DELETED");
        return n;
    }
    public Position<E> root(){
        return root;}
    public Position<E> Parent (Position<E> P){
        Node<E> c=validate(P);
        return c.getParent();
    }
    public Position<E> left(Position<E>P){
        Node<E> C=validate(P);
        return C.getLeft();
    }
    public Position<E> right(Position<E>P){
        Node<E> C=validate(P);
        return C.getRight();
    }
    public int childnum(Position<E>p){
        int count=0;
        if (left(p)!=null)
            count++;;
        if (right(p)!=null)
            count++;
        return count;
    }














    private static class Node<E> implements Position<E>{
        E element;
        Node<E> parent;
        Node<E> left;
        Node<E> right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        @Override
        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }
}
