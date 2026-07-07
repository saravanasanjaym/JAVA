import java.util.*;
class sumofdigit 
{
    static int sumofdigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return (n%10)+sumofdigit(n/10);
        }
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
		System.out.print("Enter a digit: ");
        int n=s.nextInt();
        sumofdigit d=new sumofdigit();
        int r=d.sumofdigit(n);
        System.out.println("Sum of digits is: "+r);
    }
}