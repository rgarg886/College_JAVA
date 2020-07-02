class parseint{
  public static void main(String args[]){
    try{
      int x = Integer.parseInt("23.9");
      System.out.println(x);
    }
    catch(Exception e){
      System.out.println("Can't parse float type to int.");
    }
  }
}
