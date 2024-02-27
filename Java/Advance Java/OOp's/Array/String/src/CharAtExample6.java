import java.util.*;
public class CharAtExample6 {
	ArrayList<Character>al;
	//  Constructor for creating and assigning values to the ArrayList al
	
	CharAtExample6(){
		al=new ArrayList<Character>();
		
		al.add('A');
		al.add('a');
		al.add('E');
		al.add('e');
		al.add('I');
		al.add('i');
		al.add('O');
		al.add('o');
		al.add('u');
		al.add('U');				
}
	private boolean isVowel(char c) {
		for(int i=0;i<al.size();i++) {
			if(c==al.get(i)) {
				return true;
			}
		}
		return false;
		
	}
	// a method that calculates vowels in the string is 
	
	public int countVowels(String s) {
		int countVowels=0;
		int size=s.length();
		
		for(int j=0;j<size;j++) {
			char c=s.charAt(j);
			if(isVowel(c)) {
				countVowels=countVowels+1;
			}			
		}
		
		return countVowels; 
	}
	
	
	public static void main(String args[]) {
		CharAtExample6 obj=new CharAtExample6();
		String str="Ajay";
		int noOfVowel=obj.countVowels(str);
		System.out.println("String : "+str);
		System.out.println("Total number of Vowels in the String are : "+noOfVowel);
		
		str="one apple ";
		System.out.println("String : "+str);
		noOfVowel=obj.countVowels(str);
		System.out.println(noOfVowel);
		
		
		
	}

}
