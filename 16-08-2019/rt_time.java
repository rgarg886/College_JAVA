class Time{
  int h,m,s;

  void getTime (int hh, int mm, int ss){
    h= hh;
    m= mm;
    s= ss;
  }
  void showTime (){
    int d=0; int ss=s;int mm=m; int hh=h;
    s = (ss%60);
    m = (mm%60) + (ss/60);
    h = hh + (mm/60);
    while(h>24){
      d+=1;
      h-=24;
    }
    System.out.print(d+" day "+h+" hour "+m+" minute "+s+" seconds \n");
  }
  static Time addTime(Time a,Time b){
    Time c = new Time();
    c.h= a.h+b.h;
    c.m= a.m+b.m;
    c.s= a.s+b.s;
    return c;
  }
  static Time subTime(Time a,Time b){
    Time c = new Time();
    c.h= a.h-b.h;
    c.m= a.m-b.m;
    c.s= a.s-b.s;

    while(c.m<0){
      c.h-=1;
      c.m+= 60;
    }
    while(c.s<0){
      c.m-=1;
      c.s+= 60;
    }

    return c;

  }
}

class rt_time{
  public static void main(String args[]){

    Time A  = new Time();
    Time B  = new Time();
    Time C  = new Time();
    A.getTime(24,23,34);
    A.showTime();
    B.getTime(2,35,20);
    B.showTime();

    C = Time.addTime(A,B);
    System.out.print("Adding \n");
    C.showTime();

    C = Time.subTime(A,B);
    System.out.print("Subtracting \n");
    C.showTime();


    
  }
}
