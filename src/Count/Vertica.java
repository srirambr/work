package Count;

import java.util.Scanner;

public class Vertica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name");
		Scanner s = new Scanner(System.in);
		String S = s.next();
		System.out.println("Length of the string"+ " " +S.length());
		for (int i = 0; i<S.length(); i++) {
			char ch = S.charAt(i);
			System.out.println(ch);
			
		}
		

	}

}
