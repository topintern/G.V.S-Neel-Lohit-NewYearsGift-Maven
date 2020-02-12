package Calculator.calculator;
import java.util.*;
public class User{
	
	
	public static void main(String args[])
	{
		System.out.println("Calculator Application\n----------------------\nEnter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter the two operands\nEnter -1 to exit");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(input!=-1)
		{
			User result=new Calculator(sc.nextInt(),input,sc.nextInt());
			System.out.println(result);	
			input=sc.nextInt();
		}
		sc.close();
	}

}
