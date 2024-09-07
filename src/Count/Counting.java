package Count;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Count no: of 'O'");
//Scanner S = new Scanner(System.in);

 String S = "good morning";
 int count=0;
 
 for (int i=0;i<S.length(); i++) {
	 char ch = S.charAt(i);
	 if(ch=='o') {
		 count++;
	 }
	 	 
	 
 }
 System.out.println(count);

 
}
	}


