class Rational{
  int p,q;

  Rational(){
    p=0;
    q=1;
    System.out.print("Blank Object Created \n");
  }
  Rational(int a, int b){
    p=a;
    q=b;
  }

  void showRational(){
    System.out.print(p+" / "+q+"\n");
  }
}

class Rational_main{
  public static void main(String args[]){
    Rational x = new Rational();
    x.showRational();
    Rational y = new Rational(2,4);
    y.showRational();
  }
}
