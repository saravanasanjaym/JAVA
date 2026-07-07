import java.util.*;
class fibo
{
    static int fibo(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
		else
			return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fibo d=new fibo();
        int r=d.fibo(n);
        System.out.println(r);
    }
}