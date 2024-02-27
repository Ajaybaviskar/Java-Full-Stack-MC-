
public class ChatAtEx4 {
	public static void main(String args[]) {
		String str="Welcome";
		for(int i=0;i<=str.length()-1;i++) {
			if(i%2!=0) {
				System.out.print(" Char at "+i+" Place "+str.charAt(i));
			}
		}
	}	
}
