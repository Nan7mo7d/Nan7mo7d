import java.util.Scanner;

/**
 * Created by NAN7 on 3/12/2022.
 */
public class R15 {
    public static void main(String[] args) {

        CircularLinkedList<Integer> List1 = new CircularLinkedList<>();
        CircularLinkedList<Integer> List2 = new CircularLinkedList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers for list:1  ");
        for (int i = 0; i <4 ; i++) {
            List1.addFirst(input.nextInt());
        }
        System.out.println("Enter numbers for list:2  ");
        for (int i = 0; i <4 ; i++) {
            List2.addFirst(input.nextInt());
        }

        boolean x=List1.equals(List2);
        System.out.println(x);
    }
}
