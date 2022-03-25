import java.util.Scanner;

/**
 * Created by NAN7 on 2/27/2022.
 */
public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList<String>list=new DoubleLinkedList<>();
        Scanner in= new Scanner(System.in);
        System.out.println("1-add first \t 2-add last \t 3-remove first \t 4-remove last \t 0-Exit");
        int choice=-1;
        while (choice!=0){
            System.out.println("your choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input a name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input a name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("removed is "+list.removeFirst());
                    break;
                case 4:
                    System.out.println("removed last "+list.removeLast());
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("first= "+list.first()+"\t last= "+list.last()+"\t size= "+list.size());

        }


    }
}
