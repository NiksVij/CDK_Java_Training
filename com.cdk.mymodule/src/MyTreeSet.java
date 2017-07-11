import java.util.*;

public class MyTreeSet {

    public static void main(String a[]){

        HashSet hs = new HashSet();
        hs.add("mhguyhu");
        hs.add("ab");

        LinkedList ll = new LinkedList();

        ll.add("hsdf");

        TreeSet ts = new TreeSet(hs);
        ts.addAll(ll);
        ts.add("one");
        ts.add("two");
        ts.add("three");
        if(ts.add("ab")==true) //check whether ab got added to TreeSet?
        {
            System.out.println("was able to insert ab");
        }
        else{
            System.out.println("was not able to insert ab");
        }


        System.out.println("Elements: "+ts+"\n------------------------------");

        Iterator itr = ts.iterator();
        for(;itr.hasNext();)
        {
            String str = (String)itr.next();
            System.out.println(str+" ");
        }

        //delete all elements from set
        ts.clear();

        System.out.println("Is set empty: "+ts.isEmpty()+" -- "+ll.size());
        ts.add("one");
        ts.add("three");
        System.out.println("Size of the set: "+ts.size());

        System.out.println("Elements: "+ts);
    }
}
