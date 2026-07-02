import java.util.*;
public class Reverse_K 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter queue elements:");
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) 
		{
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) 
		{
            queue.offer(stack.pop());
        }
        for (int i = 0; i < n - k; i++) 
		{
            queue.offer(queue.poll());
        }
        System.out.println("Queue after reversing first " + k + " elements:");
        while (!queue.isEmpty())
		{
            System.out.print(queue.poll() + " ");
        }
    }
}