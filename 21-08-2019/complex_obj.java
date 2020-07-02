class Complex{
  int r,i;

  void getComplex(int a, int b){
    r = a;
    i = b;
  }

  void showComplex(){
    System.out.print(r+" + "+i+"i \n");
  }

  static Complex addComplex(Complex A, Complex B){
    Complex C = new Complex();
    C.r = A.r + B.r;
    C.i = A.i + B.i;
    return C;
  }

  static Complex subComplex(Complex A, Complex B){
    Complex C = new Complex();
    C.r = A.r - B.r;
    C.i = A.i - B.i;
    return C;
  }
}

class complex_obj{
  public static void main(String args[]){
    Complex X = new Complex();
    Complex Y = new Complex();
    Complex Z = new Complex();

    X.getComplex(12,9);
    System.out.print("X = ");
    X.showComplex();
    Y.getComplex(6,5);
    System.out.print("Y = ");
    Y.showComplex();

    Z = Complex.addComplex(X,Y);
    System.out.print("Adding X and Y, Z = ");
    Z.showComplex();

    Z = Complex.subComplex(X,Y);
    System.out.print("Subtracting X and Y, Z = ");
    Z.showComplex();
  }
}
