package Variables;

public class Vars {
	
	static int num1 = 10; //static variables
	static int num2 = 20;
	
	private static int add(int a , int b) {
		// TODO Auto-generated method stub
		int sum = a + b; // local variable
		System.out.println("Local variable sum : " + '\n'  +sum);
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("local variable to method add : " + sum);
		
	System.out.println("static variables:" + '\n' + "num1 = " + num1 + '\n' + "num2 = " +num2);
	int result = add(num1,num2); //instance variable
	System.out.println("Instance variable" + '\n' + "Result: " +result);
	}

	

}
