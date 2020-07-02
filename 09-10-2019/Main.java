class ThreadBCA extends Thread{
  public void run(){
    for(int i = 0; i < 100; i++){
      System.out.println("BCA");
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
  }
}

class ThreadAmity extends Thread{
  public void run(){
    for(int i = 0; i < 100; i++){
      System.out.println("Amity");
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
  }
}

class Main{
  public static void main(String args[]){
    ThreadBCA A = new ThreadBCA();
    ThreadAmity B = new ThreadAmity();

    A.start();
    B.start();
  }
}
