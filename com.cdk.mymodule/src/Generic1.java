
class Vehicle{
    String regNum;

    Vehicle(String regNum)
    {
        this.regNum = regNum;
    }

    public String toString()
    {
        return regNum;
    }
}

//Below is an example of Generic class
class GArray<H> {

    private H objs[];
    GArray(H []objs)
    {
        this.objs = objs;
    }

    public void printAll() {
        for(H obj: objs)
        {
            System.out.println(obj);
        }
    }
}



public class Generic1
{
    public static void main(String[] args) {
        Vehicle arr[] = new Vehicle[2];

        arr[0] = new Vehicle("AABCD");

        arr[1] = new Vehicle("GHIJK");
        GArray<Vehicle> gah = new GArray<Vehicle>(arr);

        gah.printAll();
    }
}
