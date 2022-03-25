import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

/**
 * Created by NAN7 on 3/14/2022.
 */
public class TestSingly {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> Link1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> Link2 = new SinglyLinkedList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers for list 1  ");
        for (int i = 0; i <3 ; i++) {
          Link1.addFirst(in.nextInt());
        }
        System.out.println("Enter numbers for list 2  ");
        for (int i = 0; i <3 ; i++) {
           Link2.addFirst(in.nextInt());
        }
      boolean x=Link1.equals(Link2);
        System.out.println(x);





    }
}