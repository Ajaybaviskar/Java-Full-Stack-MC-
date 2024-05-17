// Stack
import java.util.Stack; 
import java.util.Iterator;
public class TestJavaCollection4 {
	public static void main(String args[]) {
		Stack<String> stack=new Stack<String>(); 
		stack.push("Ayush"); 
		stack.push("Ram"); 
		stack.push("Ram"); 
		stack.push("Amit"); 
		stack.push("Garima"); 
		stack.pop();  // Here we pop one item in stack 
		
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
}
