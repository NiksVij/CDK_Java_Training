import java.io.File;

/**
 * Created by vijayn on 7/8/2017.
 */
public class NoOfFilesAndFoldeers {

    public static void main(String args[]){
        File file = new File("C:\\Users\\vijayn\\IdeaProjects\\MyProject\\com.cdk.mymodule\\src");

        File[] fileArray =file.listFiles();
        for (File file1 : fileArray)
            System.out.println(file1.getName());

        File dir1 = new File("./eeee");
        if(dir1.mkdir()){
            System.out.println(dir1.getName());
        }
        else {

        }
    }
}
