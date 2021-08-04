
public class DivisorCalc {
	public static int gcd(int num1, int num2) {
		if (num2 == 0) {	
			return num1;
		} else if (num2 <= num1 && num1 % num2 == 0) {	
			return num2;
		} else if (num2 > num1) {	
			return gcd(num2, num1);
		} else {	
			int r = num1 % num2;
			return gcd(num2, r);
		}
		
	}
	
	public static void main(String[] args) {
		// input 1
		int num1 = 10, num2 = 20, result;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// input 2.1
		num1 = 12; num2 = 14;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// input 2.2
		num1 = 14; num2 = 16;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// input 3
		num1 = 16; num2 = 18;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// input 4
		num1 = 18; num2 = 10;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
				
	}
}


