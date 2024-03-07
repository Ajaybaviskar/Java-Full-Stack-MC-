//Example of the sleep() method in java when the sleeping time is live
import java.lang.Thread;
import java.io.*;
public class TestsleepMethod3 {
	public static void main(String args[]) {
		// we can also use throws keyword followed by exception
		//name
		
		try {
			for(int j=0;j<5;j++) {
				// it throw the exception IIlegalArgument
				Thread.sleep(-100);
				System.out.println(j);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
