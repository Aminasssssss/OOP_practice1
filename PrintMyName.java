package test;

public class PrintMyName {

	public static void main(String[] args) {
		String name ="aaa";
		String border="+" + "-".repeat(name.length()+2)+ "+";
		String middleLine="| "+name+ " |";
		
		
		System.out.println(border);
		System.out.println(middleLine);
		System.out.println(border);
		
		

	}

}
