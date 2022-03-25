import java.util.Stack;

public class P635<E>extends Stack<E> {
    static int prve(char kh) {
        if (kh == '+' || kh == '-')
            return 1;
        if (kh == '*' || kh == '/')
            return 2;
        if (kh == '^')
            return 3;
        return -1;
    }

    static String Expression(String exp) {
        String res = new String("");
        Stack<Character> Stac = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                res += c;
            else if (c == '(')
                Stac.push(c);
            else if (c == ')') {
                while (!Stac.isEmpty() && Stac.top() != '(')
                    Stac.pop();
            }
            {
                while (!Stac.isEmpty() && prve = (Stac.top())) {
                    res += Stac.pop();

                }

                Stac.push(c);
            }

        }
        while (!Stac.isEmpty()) {
            if (Stac.top() == '(') return "";
            res += Stac.pop();
        }
        return res;


    }
}

public abstract class Q3<E>
{
    static int prve(char kh){
        if (kh=='+'||kh=='-')
            return 1;
        if (kh=='*'||kh=='/')
            return 2;
        if (kh=='^')
            return 3;
        return -1;
    }
    static String Expression(String exp) {
        String res = new String("");
        Stack<Character> Stac = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                res += c;
            else if (c == '(')
                Stac.push(c);
            else if (c == ')') {
                while (!Stac.isEmpty() && Stac.top() != '(')
                    Stac.pop();
            }
            {
                while (!Stac.isEmpty() && prve = (Stac.top())) {
                    res += Stac.pop();
                }
                Stac.push(c);
            }
        }
        while (!Stac.isEmpty()){
            if(Stac.top()=='(')return "";
            res += Stac.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String exp="((5+2)*(8-3)) /4 ";
        System.out.println(Expression(exp));
    }}
