/**
 * Created by TOSHIBA on 15/03/22.
 */import java.io.*;
import java.util.*;

public class R64 {
    public static void main(String args[])
        {
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(60);
            stack.push(5);

            System.out.println("Initial Stack: " + stack);
            System.out.println("Popped element: "
                    + stack.pop());
            System.out.println("Popped element: "
                    + stack.pop());
            System.out.println("Stack after pop operation "
                    + stack);
        }}


