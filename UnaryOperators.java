package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// Increment
		int X=5;
		int Y=X++;//PreIncrement
		int Z=++X;//PostIncrement
		System.out.println("X="+X);
		System.out.println("Y="+Y);
		System.out.println("Z="+Z);
		// Decrement
		int M=10;
		int N=M--;//PostDecrement
		int O=--M;//preDecrement
		System.out.println("M="+M);
		System.out.println("N="+N);
		System.out.println("O="+O);
	}
}
