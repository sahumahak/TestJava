package OOP;

public class Calculator {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.addition(5,5);
		
		
	}

	public void addition(int a , int b) {
		
		int sum = a + b;
		System.out.println("This is sum--" + sum);
	}

	public void substraction(int a , int b) {
		
		int sub =a-b;
		System.out.println("This is sub--" + sub);
	}
	
	public void multiply() {
		int a=5;
		int b=5;
		int mul =a*b;
		System.out.println("This is mul--" + mul); 
	}

	public void Division() {
		int a=5;
		int b=5;
		int div =a/b;
		System.out.println("This is div--" + div);
	}
	public void Modulus() {
		int a=5;
		int b=5;
		int mod =a%b;
		System.out.println("This is mod--"+ mod);
	}
	
}

	

