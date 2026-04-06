

public class FirstTask {

	
	static void swap(int a, int b) {
			int temp = a;
			a=b;
			b=temp;
			System.out.println(" inside  Swap method   a = "+ a + " b = " + b);
			
			
		}
	public static void main(String[] args) {
		int a = 10;
		int b= 20;
		
		System.out.println(" Before Swap a = "+ a + " b = " + b);
		swap(a, b);

		System.out.println(" After Swap a = "+ a + " b = " + b);
	

	}

}
