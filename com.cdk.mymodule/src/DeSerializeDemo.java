
import java.io.*;

//Object which need to be serialized need to be implemented from Serializable
//interface
//java.io.NotSerializableException is thrown, if below class doesn't implement
//Serializable interface
public class DeSerializeDemo
{
    public static void main(String[] args)
    {
        try
        {

            System.out.println("De serializing object...");

            //DeSerialization starts here
            FileInputStream fis = new FileInputStream("mystudent.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentInfo to = (StudentInfo)ois.readObject();

            System.out.println("before printing Object");

            to.printStudentInfo();

            //RMI(Remote Method Invocation) is based on Serialization/Deserialization
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}
