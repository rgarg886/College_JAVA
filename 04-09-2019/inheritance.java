class AllInteger{
  int x;

  void getValue(int a){
    x = a;
  }

  void showValue(){
    System.out.print("X = "+x+"\n");
  }
}

class AllNumber extends AllInteger{
  double y;

  void getValue(double a){
    y = a;
  }

  void showValue(){
    System.out.print("Y = "+y+"\n");
  }
}

class inheritance{
  public static void main(String args[]){

    AllNumber X = new AllNumber();
    X.getValue(3);
    X.showValue();

    System.out.print(X.x);
  }
}
