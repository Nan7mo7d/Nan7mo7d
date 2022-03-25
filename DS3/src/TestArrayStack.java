import java.util.Scanner;

/**
 * Created by NAN7 on 1/23/2022.
 */
public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack= new ArrayStack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("Is the stack empty?" +myStack.isEmpty());
        System.out.println("input integer elements:" );

        for (int i = 0; i <5 ; i++) {
            myStack.push(in.nextInt());
            System.out.println("Is the stack empty?" +myStack.isEmpty());
            System.out.println("Top element is: "+ myStack.top());
            System.out.println("Size of stack is: " +myStack.size());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Deleted element is: "+myStack.pop());
            System.out.println("Top element after pop is: "+myStack.top());
            System.out.println("I the stack empty? "+myStack.isEmpty());


        }
    }
}
