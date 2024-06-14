package finalKeywordPack1;

//trial and error to show errors


public class FinalinVariable {
	
	static final String name = "Jithu";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable with final cannot have value change in the lifetime of variable.
		
		
		name = "abc";
		System.out.println(name);
	}

}
