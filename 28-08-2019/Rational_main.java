class Rational{
  int p,q;

  void getRational(int x,int y){
    p=x;
    if(y==0){
      System.out.print("\n Not a Rational Number \n");
    }
    else{
      q=y;
      margin(p,q);
    }

  }
  void margin(int p,int q){
    int n;
    if (p<q){
      n=p;
    }
    else{
      n=q;
    }
    for (int i=2;i<=n;i++){
      if(p%i==0 && q%i==0){
        p= p/i;
        q= q/i;
      }
    }
  }
  void margin(){
    int n;
    if (p<q){
      n=p;
    }
    else{
      n=q;
    }
    for (int i=2;i<=n;i++){
      if(p%i==0 && q%i==0){
        p= p/i;
        q= q/i;
      }
    }
  }

  void showRational(){
    System.out.print("\n "+p+" / "+q);
  }

  static Rational addRational(Rational a,Rational b){
    Rational c = new Rational();
    if(a.q==b.q){
      c.p = a.p+b.p;
      c.q = a.q;
    }
    else{
      c.p = (b.q*a.p) + (b.p*a.q);
      c.q = a.q*b.q;
    }
    c.margin();
    return c;
  }
}

class Rational_main{
  public static void main(String args[]){
    Rational x =new Rational();
    Rational y =new Rational();
    Rational z =new Rational();
    x.getRational(2,4); System.out.print("\n X = ");
    x.showRational();
    y.getRational(3,6); System.out.print("\n Y = ");
    y.showRational();

    z = Rational.addRational(x,y); System.out.print("\n Z = ");
    z.showRational();
  }
}
