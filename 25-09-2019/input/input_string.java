package input;
import java.io.*;

public class input_string{
  public static String getString(){
    try{
      System.out.println("Enter a string:");
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);
      var x = br.readLine();

      return x;
    }
    catch(Exception e){
      System.out.println("Input error occurred");
      return "Input error occurred";
    }
  }
}
