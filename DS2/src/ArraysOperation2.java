import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NAN7 on 1/16/2022.
 */
public class ArraysOperation2 {
    int []x;
    int numOfElements;

    public ArraysOperation2(){
        x=new int [5];
        numOfElements=0;
    }
    public int addSortedElement (int e)
    {
        if (numOfElements<x.length)
        {
            int i=numOfElements;
            while (i>0 && e<x[i-1])
            {
                x[i]=x[i-1];
                i--;
            }
            x[i]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }


    public int addElements(int e){
        if (numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public int deleteElement(){
        if (numOfElements>0)
        {
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0;
        }
        return -1;
    }


    public static void main(String[] args) {
        ArraysOperation2 test=new ArraysOperation2();
        Scanner in=new Scanner(System.in);
        System.out.println(Arrays.toString(test.x));
        System.out.println("Input Element: ");
        for (int i = 0; i <7 ; i++) {
           //  not sorted ...if (test.addElements(in.nextInt())==0)
             if (test.addSortedElement(in.nextInt())==0)

            System.out.println("Added Sucessfully");
            else
                System.out.println("Array is full");
            System.out.println(Arrays.toString(test.x));

        }
        for (int i = 0; i <1 ; i++) {
            if (test.deleteElement()==0)
                System.out.println("Deleted successfully");
            else
                System.out.println("Array is empty");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
