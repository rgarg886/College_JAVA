class InvalidAmountException extends Exception{
  public InvalidAmountException(String s){
    super(s);
  }
}

public class ATMCash{
  void amountCheck(int cash) throws InvalidAmountException{
    if( cash % 100 != 0){
      throw new InvalidAmountException("Enter amount in multiples of 100");
    }
  }
  public static void main(String args[]){
    ATMCash obj = new ATMCash();
    try{
      obj.amountCheck(2222);
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
