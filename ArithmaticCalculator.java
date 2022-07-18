package ArithmaticCalculator;
import java.util.Scanner;
    class working
   {
       public int addition(int n,int m)
      {
          int a=n+m;
          return a;
      }
      public int substraction(int n,int m)
      {
          int s=n-m;
          return s;
      }
     public int multiplication(int n,int m)
     {
          int mul=n*m;
          return mul;
     }
     public double division(double n,double m)
     {
          double d=n/m;
          return d;
     }
   }
public class ArithmaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		working w=new working();
		while(true)
		{    
		    System.out.println("Enter what operation to perform: \n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Exit");
		    int op=s.nextInt();
		    if(op==5)
		    {
		    	break;
		    }
		    else
		    {
		    	 System.out.println("Enter First Number: ");
			     int num1=s.nextInt();
			     System.out.println("Enter second number: ");
			     int num2=s.nextInt();
		         if(op==1)
		         {
		             int ans=w.addition(num1,num2);
		             System.out.println("The Addition of num1 and num2 is : "+ans);
		         }
		         else if(op==2)
		         {
		              int ans=w.substraction(num1,num2);
		              System.out.println("The Substraction of num1 and num2 is : "+ans);
		         }
		         else if(op==3)
		         {
		              int ans=w.multiplication(num1, num2);
		              System.out.println("The Multiplication of num1 and num2 is : "+ans);
		         }
		         else if(op==4)
		         {
		              double ans=w.division(num1, num2);
		              System.out.println("The Division of num1 and num2 gives remainder : "+ans);
		         }
		         else
		         {
		              System.out.println("Enter valid Input");
		     }
		   }}



	}

}