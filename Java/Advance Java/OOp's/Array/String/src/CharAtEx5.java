public class CharAtEx5 {
    public static void main(String args[]){
        String str="tA";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || (str.charAt(i)=='A')){
                count++;
            }
        }
        System.out.println("t is come :"+count+" time");
        System.out.println("T is come :"+count+"time");
    }
    
}
