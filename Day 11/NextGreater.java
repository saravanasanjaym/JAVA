import java.util.*;
class NextGreater 
{
    public static void main(String[] args) 
    {
        int[] a = {4, 5, 2, 10, 8, 12};
        for (int i = 0; i < a.length; i++) 
        {
            int next = -1;
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[j] > a[i]) 
                {
                    next = a[j];
                    break;
                }
            }
            System.out.println(a[i] + " --> " + next);
        }
    }
}