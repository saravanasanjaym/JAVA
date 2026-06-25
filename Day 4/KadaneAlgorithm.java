public class KadaneAlgorithm 
{
    public static void main(String[] args) 
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 5, 100};
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if (sum > maxSum) 
            {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
}