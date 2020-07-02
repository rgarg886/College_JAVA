package input;
import java.io.*;

public class input_int{
    public static int getInt(){
      try{
        System.out.println("Enter a integer:");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        var x = br.readLine();

        return Integer.parseInt(x);
      }
      catch(Exception e){
        System.out.println("Input error occurred");
        return 0;
      }
    }
}
