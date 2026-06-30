import java.util.Scanner;
import java.util.Stack;
public class Parenthesis
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter the parentheses: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++)
		{
            char ch = str.charAt(i);
            if (ch == '(') 
			{
                stack.push(ch);
            }
			else if (ch == ')') 
			{
                if (stack.isEmpty()) 
				{
                    System.out.println("Parentheses are Not Balanced");
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty())
		{
            System.out.println("Parentheses are Balanced");
        } 
		else
		{
            System.out.println("Parentheses are Not Balanced");
        }
        sc.close();
    }
}