package algorithms.recursion;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Integer n = 1; n <= 40; n++){
		System.out.print(n + "\t" + fibonacci(n)+"\n");
		}
	}
	public static Integer fibonacci(Integer n){
		if(n > 2){
			return fibonacci(n-1)+fibonacci(n-2);
		}else{
			return 1;
		}
	}
}
