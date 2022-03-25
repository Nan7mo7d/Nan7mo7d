import java.util.Scanner;

/**
 * Created by NAN7 on 1/30/2022.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue <Character> queue=new ArrayQueue<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("Input queue elements ");
        for (int i = 0; i <5 ; i++) {
            queue.enQueue(in.next().charAt(0));
            System.out.println("first=" + queue.front());
            System.out.println("size=" + queue.size());
        }
        System.out.println("queue elements after delete");
        while (!queue.isEmpty()){
            System.out.print(queue.dequeue()+"\t");
        }
    }
}
