import java.util.Arrays;

/**
 * Created by NAN7 on 1/16/2022.
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int []a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        int [] after=reverse(a);
        System.out.println(Arrays.toString(after));
    }
    public static int[] reverse (int []x)
    {
        int n=x.length-1; //size
        for (int i = 0; i <x.length/2 ; i++) {
            int temp=x[i];
            x[i]=x[n];
            x[n]=temp;
           n--;
        }
        return x;
    }
    //print using a method.not to string
    public static void print(int[]x)
    {
        System.out.print("[");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i<x.length)
                System.out.print(",");
        }
        System.out.print("]");
    }

}
