import java.util.Arrays;
import java.util.Random;

/**
 * Created by TOSHIBA on 17/03/22.
 */
public class RRandom {
    public static void main(String[] args) {
        int []a={11,12,13,14,15};
        System.out.println(Arrays.toString(remove(a)));

    }
    public static int[] remove(int[]E)
    {
        Random x=new Random();
        int y=x.nextInt(E.length-1);
        System.out.println(y);
        for (int i = 0; i <E.length ; i++)
        {
            if(y<=i){
                E[i]=-1;
            }
        }
        return E;
    }}
