
import java.util.*;
class Vehicle1{
     String vno,model;
     int unit,price;

    Vehicle1(String v,String m, int u ,int p){
        vno = v;
        model = m;
        unit = u;
        price =p;
    }

    @Override
    public String toString() {
        return "vno + model+unit+price " + vno + " "+ model+" "+unit+" "+price;
    }
    @Override
    public int hashCode() {
        int i=0;

        return i;
    }

    @Override
    public boolean equals(Object obj) {
        Vehicle1 vObj =(Vehicle1)obj;
        if(vObj.vno.equals(vno)&&vObj.model.equals(model))
            return true;
        else
            return false;
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {
        //List allows duplicate values, stores values in the order given/added
        //Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
        ArrayList<Vehicle1> atmp = new ArrayList<Vehicle1>();
        atmp.add (new Vehicle1("hgdf"," asdf ", 12,124124));

        ArrayList<Vehicle1> al = new ArrayList<Vehicle1>();
        al.addAll(atmp);
        al.add (new Vehicle1("hgdf"," asdf ", 12,124124));
        al.add (new Vehicle1("Suz"," TS09  ", 12,200000));
        al.add (new Vehicle1("Mer"," AP18 ", 12,30000));
        al.add (new Vehicle1("Aud "," PB10 ", 12,40000));

        dArrayList("Original ArrayList: ", al);

        Collections.reverse(al);

        dArrayList("After Reversing: ",al);
        System.out.println("-------------------------");

        Collections.shuffle(al);
        HashSet<Vehicle1> vehicle1HashSet = new HashSet<Vehicle1>();
        vehicle1HashSet.add(new Vehicle1("Skod","RJ20",2,120000));
        vehicle1HashSet.addAll(al);
        vehicle1HashSet.add(new Vehicle1("Skod","RJ20",2,120000));
        dArrayList("After Shuffling ",vehicle1HashSet);
    }

    static void dArrayList(String str, HashSet<Vehicle1> al)
    {
        System.out.println("------------------------------");
        System.out.println(str);
        Iterator<Vehicle1> itr = al.iterator();
        //using Iterator, we can traverse only in forward direction
        for(;itr.hasNext();)
        {
            Vehicle1 tStr = itr.next(); //returns Object
            System.out.println(tStr+" ");
        }
        /*System.out.println();
        for (Vehicle1 vehicle1 : al){
            System.out.println(vehicle1);
        }*/
    }

    static void dArrayList(String str, ArrayList<Vehicle1> al)
    {
        System.out.println("------------------------------");
        System.out.println(str);
        Iterator<Vehicle1> itr = al.iterator();
        //using Iterator, we can traverse only in forward direction
        for(;itr.hasNext();)
        {
            Vehicle1 tStr = itr.next(); //returns Object
            System.out.println(tStr+" ");
        }
        /*System.out.println();
        for (Vehicle1 vehicle1 : al){
            System.out.println(vehicle1);
        }*/
    }

}
