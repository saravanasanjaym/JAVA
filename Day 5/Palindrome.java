import java.util.*;
public class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		int f=0;
		int l=str.length()-1;
		boolean b=false;
		while(f<l)
		{
		    if(ch[f]!=ch[l])
		    {
		        
		        b=true;
		        break;
		    }
		    else
		    {
		        f++;
		        l--;
		    }
		}
		if(!b)
		{
		    System.out.print("Palindrome");
		}
		else
		{
		     System.out.print("Not a Palindrome");
		}
	}
}