import java.util.Scanner;

/**
 * Created by NAN7 on 2/20/2022.
 */
public class TestCircular {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("1-Add first\t 2-Add last \t 3-Remove first\t 4-Rotate\t 0-Exit  ");
        int choice=-1;
        while (choice!=0)
        {
            System.out.println("your choice: ");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name: ");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name: ");
                    list.addFirst(in.next());
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.rotate();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("First= "+list.first()+"\tlast= "+list.last()+"\tsize= "+list.size());

        }
    }
}
