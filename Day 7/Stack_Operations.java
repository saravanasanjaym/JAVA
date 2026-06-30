import java.util.Stack;
public class Stack_Operations 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Removed Element: " + stack.pop());
        System.out.println("Stack after Pop: " + stack);
        if (stack.isEmpty()) 
        {
            System.out.println("Stack is Empty");
        } 
        else 
        {
            System.out.println("Stack is Not Empty");
        }
    }
}