

public class SecondTask {

	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		
		if(s1==s2) {
        System.out.println("both the value is inside scp or same location");
	}
		if(s1 == s3) {
			 System.out.println("both the value is inside scp or same location");
		}
		else {
			 System.out.println("both the value are not at same location");
		}
			
		}

}
