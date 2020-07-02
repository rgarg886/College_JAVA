//create a class for method to calculate factorial.
import java.util.Scanner;
class method{
	public static int factorial(int a){

		int fact=1;
		if (a==0){
			 fact=1;
		}
		else if (a==1){
			 fact=1;
		}
		else{
			for(int i=1;i<=a;i++){
				fact = fact * i;
			}
		}

		return fact;

	}

	public static int factorial_recursive (int a){

		if(a>=1)
			return a*factorial_recursive(a-1);
		else
			return 1;
	}
}

class Factorial_operation{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int x= in.nextInt();
		System.out.print("factorial of "+x+" is "+method.factorial_recursive(x)+"\n");
	}
}