class Time{
  int h,m,s;

  void getTime (int hh, int mm, int ss){
    h= hh;
    m= mm;
    s= ss;
  }
  void showTime (){
    System.out.print(h+":"+m+":"+s+"\n");
  }
}

class rt_time{
  public static void main(String args[]){

    Time A  = new Time();
    A.getTime(12,23,34);
    A.showTime();
  }
}
