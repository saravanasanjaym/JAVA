import java.util.Scanner;
public class SaddlePoint 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) 
        {
            int min = a[i][0];
            int col = 0;
            for(int j = 1; j < n; j++) 
            {
                if(a[i][j] < min) 
                {
                    min = a[i][j];
                    col = j;
                }
            }
            int count = 0;
            for(int k = 0; k < n; k++) 
            {
                if(min >= a[k][col]) 
                {
                    count++;
                }
            }
            if(count == n) 
            {
                System.out.println("Saddle Point = " + min);
                return;
            }
        }
        System.out.println("No Saddle Point");
    }
}