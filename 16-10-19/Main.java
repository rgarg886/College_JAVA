class MyThread extends Thread{
  String message;
  int sleep;

  MyThread(String a,int b){
    message= a;
    sleep = b;
  }

  public void run(){
    for (int i=0; i<100; i++){
      System.out.println(message);
      try{
        Thread.sleep(sleep);
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
  }
}

class Main{
  public static void main(String args[]){

    MyThread a = new MyThread("BCA",1000);
    MyThread b = new MyThread("Amity",1000);

    a.start();
    b.start();
  }
}
