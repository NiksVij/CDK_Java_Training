import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class HashMapDemo {

    public static void main(String[] args) {

//Map is used to store key:value object pairs
//HashMap doesn't follow any order, hence there is no guarantee for the order
//In HashMap elements are stored by using Hashing technique on the key objects
//Tree Map stores elements in ascending order of keys
        Map tm1 = System.getenv();
        System.out.println(tm1);
        //tm1.put("hhhhhhh","jfhsgfdjusgfsd");

        HashMap<String, String> hm = new HashMap<>();
        hm.put("sfdsfds"/*key*/, "nfghgfhfg"/*value*/);
        hm.put("qwdfdsfs", "nfghgfhgf");
        hm.put("wererwe", "mhjuytuy");
        hm.put("qwewewq", "vnfkhfjfk");
        hm.put("nvcsdsfh", "wyetrwye");
        hm.put("ghfghfg", "werewhwej");
        hm.put("msdfksdfhsd", null);
        hm.put("wererwe", "mhjuytuy");
        hm.put(null, "jhgjhg");

        TreeMap<String, String> tm = new TreeMap<String, String>();
        /*tm.putAll(hm);*/
        tm.put("aaaaaa", "jdhfsdujfgsdf");
        tm.put("bbbbbb", "jdhfsdujfgsdf");
        tm.put("zzzzzzz", "mnfgfdghfdijgdf");
        tm.put("bbbbbb", "mmmmmmmmmmmmmmmmmmm");
        tm.put("bbbbbb", "gggggggggggggggggbbbb");
        //tm.put(null, "mnfgfdghfdijgdf");//null key is not allowed


        System.out.println("Value of key,wererwe:"+hm.get("wererwe"));
        System.out.println();

        //set of enteries
        Set s= tm.entrySet();

        //Now s is Set having all the Entry

        Iterator itr1 = s.iterator();
        while(itr1.hasNext())
        {
            Map.Entry me = (Map.Entry)itr1.next(); // Map.Entry is an inner interface
            System.out.println("Key:"+me.getKey()+" "+"value:"+me.getValue());
        }

        return;
    }
}
