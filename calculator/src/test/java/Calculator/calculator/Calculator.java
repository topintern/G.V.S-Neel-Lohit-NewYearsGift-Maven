package Calculator.calculator;
public class Calculator extends User {
	int result[];
	int op;
	Calculator(int a,int op,int b)
	{
		int result[]={a+b,a-b,a*b,a/b};
		this.result=result;
		this.op=op;
	      
	}
	@Override
	public String toString() {
	  return op<4?String.valueOf(result[op-1]):"Invalid Input";
	}

}
