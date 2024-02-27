import java.util.ArrayList;

public class CharAtEx6{
    ArrayList<Character>al;
    // Constructor for creatig and 
    // assigning values to the ArrayList al

    CharAtEx6(){
        al=new ArrayList<Character>();
        al.add('A'); al.add('E');
        al.add('a'); al.add('e');
        al.add('I'); al.add('O');
        al.add('i'); al.add('o');
        al.add('U'); al.add('u');
        
    }

    private boolean isVowel(char c){
        for(int i=0;i<al.size();i++){
            if(c==al.get(i)){
                return true;
            }
        }
        return false;
    }
    // a method that calculates vowels is the Sting's
    public int CountVowels(String s){
        int countvowel=0;
        int size= s.length();

        for(int j=0;j<size;j++){
            char c=s.charAt(j);
            if(isVowel(c)){
                countvowel=countvowel+1;
            }
        }
        return countvowel;
    }
    public static void main(String args[]){
        CharAtEx6 obj =new CharAtEx6();
        String str="Ajay";

        int noofvowel=obj.CountVowels(str);
        System.out.println("String : "+str);
        System.out.println("Total Number of Vowels in the String are : "+noofvowel+" In");

        str="one apple";
        System.out.println("String : "+str);
        noofvowel=obj.CountVowels(str);
        System.out.println("Total Number of Vowels i the String are : "+noofvowel);

    }
}