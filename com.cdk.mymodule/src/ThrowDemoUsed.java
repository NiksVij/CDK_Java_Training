import com.cdk.myp.ThrowDemo;

/**
 * Created by vijayn on 7/6/2017.
 */
public class ThrowDemoUsed {
    public static void main(String[] args) throws Exception{
        try
        {
            ThrowDemo.myMet();
        }catch(Exception et)
        {
            System.out.println("Handlinh the Exception");
            et.printStackTrace();
        }
    }
}
