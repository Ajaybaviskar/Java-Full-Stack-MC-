
public class Test_Garbage1 {
	public void finalize() {
		System.out.println("Object is garbage collected.."); 
	}
	public static void main(String args[]) {
		Test_Garbage1 s1=new Test_Garbage1(); 
		Test_Garbage1 s2=new Test_Garbage1();
		s1=null; 
		s2=null; 
		System.gc();
	}

}
