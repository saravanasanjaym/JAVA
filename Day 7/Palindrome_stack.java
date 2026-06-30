import java.util.*;
public class Palindrome_stack
{
    public static void main(String[] args) 
    {
        Stack<Character> stack=new Stack<>();
        String str;
        Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int i;
		for(i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		boolean palindrome=true;
		for (i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) != stack.pop()) 
			{
                palindrome = false;
                break;
            }
		}
		if (palindrome) 
		{
            System.out.println("Palindrome");
        } 
		else 
		{
            System.out.println("Not a Palindrome");
        }
    }
}