import java.util.*;
class FurthestGreater 
{
    public static void main(String[] args) 
    {
        int[] a = {5, 2, 7, 1, 3, 8, 6};
        for (int i = 0; i < a.length; i++) 
        {
            int furthest = -1;
            for (int j = a.length - 1; j > i; j--) 
            {
                if (a[j] > a[i]) 
                {
                    furthest = a[j];
                    break;
                }
            }
            System.out.println(a[i] + " --> " + furthest);
        }
    }
}