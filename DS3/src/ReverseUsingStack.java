import java.util.Arrays;

/**
 * Created by NAN7 on 1/23/2022.
 */
public class ReverseUsingStack {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        ArrayStack<Integer> s=new ArrayStack<>(a.length);
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }
        System.out.println("After reverse using stack: ");
        System.out.println(Arrays.toString(a));

    }
}
