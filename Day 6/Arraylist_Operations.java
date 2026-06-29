import java.util.ArrayList;
class Arraylist_Operations
{
    public static void main (String[] args) 
    {
      	ArrayList<Integer> a = new ArrayList<>();
      	a.add(1);
      	a.add(2);
      	a.add(3);
      	a.add(1, 7);
      	System.out.println(a);
      	a.set(0, 6);
      	System.out.println(a);
      	System.out.println(a.get(0));
      	System.out.println(a.remove(2));
      	System.out.println(a);
      	System.out.println(a.contains(7));
    }
}