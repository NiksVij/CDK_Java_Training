import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by vijayn on 7/8/2017.
 */
class MyAbcd {
    MyAbcd(){

    }
    public void met1 (int arr[] ,String str) throws ArrayIndexOutOfBoundsException{
        System.out.println("int at 9" + arr[9]);
    }
    public void met2 (int arr[] ,String str) throws StringIndexOutOfBoundsException {
        System.out.println("charAt 9" + str.charAt(9));
    }
}
public class MyReflectionDemo {
    public static void main(String args[])
    {
        try
        {
            //no parameters
            Class no_params[] = {};

            //get the Class instance of Abcd
            Class c = Class.forName("MyAbcd");

            //get the Constructor instance
            /*Constructor cons = c.getConstructor(no_params);

            //create object, which is required for invoke() method
            Object obj = cons.newInstance();
*/
            Method mta[] = c.getMethods();

            System.out.println("Below are the methods in Abcd class");

            for(Method mt:mta)
            {
                System.out.println(mt.getName());
                for(Object object :mt.getExceptionTypes()){
                    System.out.println(object.toString());
                }
            }


           // System.out.println(mta[1].getExceptionTypes());
            /*Method method1 = c.getDeclaredMethod("met1",no_params);

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
*/
            /*Class params[] = {int.class , String.class};
            Method method4 = c.getDeclaredMethod("met4",params);
            //method4
            mta[3].invoke((Abcd)obj,5," Yo! ");*/
        }catch(ClassNotFoundException cnf)
        {
            cnf.printStackTrace();
        }
       /* catch(NoSuchMethodException nsm)
        {
            nsm.printStackTrace();
        }*/
        catch(Exception ec)
        {
            ec.printStackTrace();
        }
    }
}
