
import java.util.Arrays;
public class BackupArray {

        public static void main(String[] args) {
            System.out.println( "Copy Array ="+Arrays.toString(copy()));
        }
        public static int[] copy() {
            int[] a = {1,2,3,4};
            int[] c = new int[a.length];
            c = a;
            return c;

    }
}
