import java.util.Scanner;

/**
 * Created by vijayn on 7/6/2017.
 */
public class ThrowExample {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        if(str.contains("$"))
            throw new Exception("Invalid Exception");
        else
            System.out.println(str);
    }
}
