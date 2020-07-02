import java.lang.*;
class dividebyzero{
  public static void main (String args []){
    int x = 5;
    int y = 0;

    try{
        float z = x/y;
    }
    catch(Exception e){
      System.out.println("Can't divide by zero!!");
    }
  }
}
