import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
    Stack<Integer> stack=new Stack<>();
    public void pushelement(int n){
        stack.push(n);
    }
    public int popelement(){
        return stack.pop();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args){

       StackOperation stackobj=new StackOperation();
        Scanner in=new Scanner(System.in);
        int t=0;
        while(t<=1) {
            System.out.println("Enter number to push in stach :");
            int n = in.nextInt();
            stackobj.pushelement(n);
            t++;
        }
        System.out.println("popped element :"+stackobj.popelement());
        System.out.println("pop one more elsement :"+ stackobj.popelement());

        //pop element is null
        System.out.println("stack is empty? "+stackobj.isEmpty());


    }
}
