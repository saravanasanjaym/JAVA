import java.util.*;
public class SetOperations 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
		
        System.out.print("Enter number of elements for set1: ");
        int n1 = sc.nextInt();
		
        System.out.println("Enter elements of set1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
		
        System.out.print("Enter number of elements for set2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of set2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("\nSet1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("\nUnion: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (set1 - set2): " + difference);
    }
}