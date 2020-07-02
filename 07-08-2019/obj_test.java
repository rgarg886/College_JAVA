import java.lang.*;

	class Test{
		int x;
		static int count;
	}

	class obj_test{

	public static void main (String args[]){

	Test obj1 = new Test();
	Test obj2 = new Test();

	obj1.x = 20;
	obj1.count = 1;

	System.out.print("Obj1.x = "+obj1.x+" and Obj1.count = "+obj1.count+"\n");

	obj2.x= 10;
	obj2.count += 1;

 	System.out.print("Obj1.x = "+obj1.x+" and Obj1.count = "+obj1.count+"\n");
	}
}
