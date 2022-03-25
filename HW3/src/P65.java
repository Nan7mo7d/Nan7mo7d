/**
 * Created by TOSHIBA on 19/03/22.
 */
public class P65 {
        static int josephus(int n,int Y ) {
            if (n == 1)
                return 1;
            else
                return (josephus(n - 1, Y) + Y - 1) % n + 1;}

        public static void main(String[] args) {
            int n = 14;
            int k = 2;
            System.out.println("The  place: ");
            System.out.println();
            System.out.println(josephus(n, k));

        }
}
