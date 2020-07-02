class OutOfBoundException extends Exception{
  public OutOfBoundException(String s){
    super(s);
  }
}

public class Num{
  void numCheck(int n) throws OutOfBoundException{
    if( n > 100 ){
      throw new OutOfBoundException("Number out of Bound");
    }
  }
  public static void main(String args[]){
    Num obj = new Num();
    try{
      obj.numCheck(101);
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
