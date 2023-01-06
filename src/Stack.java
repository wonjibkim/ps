import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Stack<Integer> stk = new Stack<>();

        if(stk.empty()){
            stk.push(1);
            stk.push(2);
            stk.push(3);
        }

        if(!stk.empty()){
            if(stk.peek() == 3)
                stk.pop();

        }

        if(stk.search(3) == -1){
            System.out.println("3 is poped");
        }
    }
}
