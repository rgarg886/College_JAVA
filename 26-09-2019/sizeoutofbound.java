class sizeoutofbound{
  public static void main(String args[]){
    int[] a = new int[3];

    try{
      for(int i=0; i<4; i++){
        a[i] = i;
      }
      for(int i=0; i<4; i++){
        System.out.println(a[i]);
      }
    }
    catch(Exception e){
      System.out.println("Size out of bound!!");
    }
  }
}
