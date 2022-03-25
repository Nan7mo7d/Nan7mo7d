import java.util.Arrays;
public class ReverseArray {
    //Q1
        public static void main(String[] args) {
            int[] a ={10,20,30,40};
            int [] b=a;
            System.out.println("Array ="+Arrays.toString(a));
            System.out.println( "Reversed ="+Arrays.toString(revers(b)));
        }

        public static int[] revers(int[] r)
        {
            int s = r.length-1;
            for (int i = 0; i <r.length/2 ; i++) {
                int t = r[i];
                r[i] = r[s-i];
                r[s-i] = t;
            }
            return r;
        }}
