package algorithms.recursion;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 10;
		System.out.print(factorial(n));
		
	}
	
	public static Integer factorial(Integer n){
		if(n > 0){
			return n*factorial(--n);
		}else{
			return 1;
		}
	}

}
