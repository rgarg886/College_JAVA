import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
  MyFrame(){
    setTitle("New Frame");
    setSize(400,400);
    setBackground(Color.yellow);
    setVisible(true);
    addWindowListener(new Win());
  }
}

class Win extends WindowAdapter{
  public void windowClosing(WindowEvent we){
    System.exit(0);
  }
}

class Main{
  public static void main(String args[]){
    MyFrame a = new MyFrame();
  }
}
