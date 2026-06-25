public class SlidingWindowMaxSum
{
    public static void main(String[] args) 
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 5, 4};
        int k = 3;
        int maxSum = 0;
        for (int i = 0; i <= arr.length - k; i++) 
        {
            int sum = 0;
            for (int j = i; j < i + k; j++) 
            {
                sum += arr[j];
            }
            System.out.println("Sum = " + sum);
            if (sum > maxSum) 
            {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
}