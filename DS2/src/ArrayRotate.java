import java.util.Arrays;

/**
 * Created by NAN7 on 1/16/2022.
 */
public class ArrayRotate {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
//        System.out.println("After shift left");
//        System.out.println(Arrays.toString(shiftLeft(a)));
        System.out.println("After shift right");
        System.out.println(Arrays.toString(shiftRight(a)));

    }
    public static int[] shiftLeft(int[]x)
    {
        int temp=x[0];
        for (int i = 0; i <x.length-1 ; i++) {
            x[i]=x[i+1];
        }
        x[x.length-1]=temp;
        return x;
    }
    public static int[] shiftRight(int[]y)
    {

        int temp=y[y.length-1];
        for (int i = y.length-1; i >0 ; i--) {
            y[i]=y[i-1];
        }
        y[0]=temp;
        return y;
    }
}
