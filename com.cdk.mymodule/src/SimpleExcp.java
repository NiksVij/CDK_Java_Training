class CExample
{
    public void testC() throws ArithmeticException,Exception
    {
        DExample de = new DExample();
        de.testD();
    }
}

class DExample
{
    public void testD() throws ArithmeticException,Exception
    {
        int i,j=25,k=5;
        System.out.println("stmt 1");

        i = j/k;

        if(true)
        {
            throw new Exception("SampleException");
        }
        System.out.println("stmt 2");

    }
}

public class SimpleExcp {

    public static void main(String[] args){
        try
        {
            CExample ce =new CExample();
            ce.testC();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("--------AExcp:"+ae.getMessage());
            ae.printStackTrace();
        }
        catch(Exception et)
        {
            System.out.println("--------Excp:"+et.getMessage());
            et.printStackTrace();
        }
        finally
        {
            System.out.println("in finally block");
        }


    }

}
