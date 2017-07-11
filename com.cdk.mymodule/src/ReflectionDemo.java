import java.lang.reflect.*;

class Abcd
{
    public Abcd()
    {
        System.out.println("This is Constructor");
    }

    public void met1()
    {
        System.out.println("This is met1()");
    }

    public void met2(String str)
    {
        System.out.println("This is met2(String) "+str);
    }

    public void met3(String str1,String str2)
    {
        System.out.println("This is met3(String, String) "+str1+" "+str2);
    }

    public void met4(int i ,String s){System.out.println("This is met4(int String) " +i+ " " + s);}
}

public class ReflectionDemo {
    public static void main(String args[])
    {
        try
        {
            //no parameters
            Class no_params[] = {};

            //get the Class instance of Abcd
            Class c = Class.forName("Abcd");

            //get the Constructor instance
            Constructor cons = c.getConstructor(no_params);

            //create object, which is required for invoke() method
            Object obj = cons.newInstance();

            Method mta[] = c.getMethods();

            System.out.println("Below are the methods in Abcd class");

            for(Method mt:mta)
            {
                System.out.println(mt.getName());
            }

            Method method1 = c.getDeclaredMethod("met1",no_params);

            //Now, invoke method dynamically
            method1.invoke((Abcd)obj);

            //one String parameter
            Class str_params[] = {String.class};
            Method method2 = c.getDeclaredMethod("met2", str_params);

            Object obj11[] = new Object[1];
            obj11[0] = "fsdfsd";
            //Now, invoke method dynamically
            method2.invoke((Abcd)obj, obj11);

            //one String parameter
            Class str_str_params[] = {String.class, String.class};
            Method method3 = c.getDeclaredMethod("met3", str_str_params);
            //method3.
            //Now, invoke method dynamically
            method3.invoke((Abcd)obj, "First Param", "Second Param");

            Class params[] = {int.class , String.class};
            Method method4 = c.getDeclaredMethod("met4",params);
            //method4
            mta[3].invoke((Abcd)obj,5," Yo! ");
        }catch(ClassNotFoundException cnf)
        {
            cnf.printStackTrace();
        }
        catch(NoSuchMethodException nsm)
        {
            nsm.printStackTrace();
        }
        catch(Exception ec)
        {
            ec.printStackTrace();
        }
    }
}
