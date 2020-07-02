package input;
import java.io.*;

public class input_float{
  public static float getFloat(){
    try{
      System.out.println("Enter a float:");
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);
      var x = br.readLine();

      return Float.parseFloat(x);
    }
    catch(Exception e){
      System.out.println("Input error occurred");
      return 0;
    }
  }
}
