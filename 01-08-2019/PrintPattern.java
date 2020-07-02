import java.lang.*;

public class PrintPattern {
  public static void main( String args[]){

    for (int c=1; c<5; c++){
      for (int i = 1; i <=c ; i++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
