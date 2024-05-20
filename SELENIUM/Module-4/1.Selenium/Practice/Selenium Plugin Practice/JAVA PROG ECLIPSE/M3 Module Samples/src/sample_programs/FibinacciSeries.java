package sample_programs;



public class FibinacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci1=new Fibonacci(0,1);//mem created
		fibonacci1.readInput();
		fibonacci1.calcFibo();
		Fibonacci fibonacci2=new Fibonacci(5,8);//mem created

		fibonacci2.readInput();
		fibonacci2.calcFibo();
	}

}
