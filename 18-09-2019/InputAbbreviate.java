import java.io.*;

public class InputAbbreviate{
  public static String abbreviate(String name){
    String res = "";
    String arr[] = name.split(" ");
    for(int i=0; i < arr.length-1; i++){
        res = res + arr[i].charAt(0) + ". ";
    }
    return res+arr[arr.length-1];
  }
  public static void main(String args[]){
    try{

      System.out.println("Enter a name:");
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);
      var x = br.readLine();

      x = abbreviate(x);
      System.out.println(x);
    }
    catch(Exception e){
      System.out.println("Input error occurred");
      
    }
  }
}
