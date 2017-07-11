import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapComparator {

    public static void main(String a[]){
        MyComp1 comp_obj = new MyComp1();
        TreeMap<String, String> hm = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        //add key-value pair to TreeMap
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india","country");
        hm.put("ajfdshfsf","ksjfhgikure");
        hm.put("rtrjbsjdff", "bvdsufusfs");
        hm.put("gh", "fsfsdfsd");
        hm.put("k", null);
        hm.put("gh", "abcdef");

        System.out.println("Value: "+hm.get("ajfdshfsf"));
        Set s= hm.entrySet();
        Iterator itr1 = s.iterator();
        int i=0;
        while(itr1.hasNext())
        {//Entry is inner interface in Map interface

            Map.Entry me = (Map.Entry)itr1.next();
            System.out.println("\nKey:"+me.getKey()+" "+"\nvalue:"+me.getValue());

            if(i==0)
            {
                i++;
                itr1.remove(); //to remove Map.Entry key value pair
                //me.setValue(obj); //to update a value
            }
        }

        System.out.println("----------------------------------");
        Iterator itr2 = s.iterator();
        while(itr2.hasNext())
        {//Entry is inner interface in Map interface

            Map.Entry me = (Map.Entry)itr2.next();
            System.out.println("\nKey:"+me.getKey()+" "+"\nvalue:"+me.getValue());

        }
    }
}


//Here String is type of the Key object
class MyComp1 implements Comparator<String>{
    public int compare(String str1, String str2) {
        //return str1.compareTo(str2);
        //return str2.compareTo(str1);
        return str1.length()-str2.length();
    }
}