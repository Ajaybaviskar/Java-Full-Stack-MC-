import java.lang.Thread;
import java.io.*;
public class TestsleepMethod2 {
	// main method 
	public static void main(String args[]) {
		try {
			for(int j=0;j<5;j++) {
				Thread.sleep(1000);
				System.out.println(j);
			}
		}
		catch(Exception e) {
			// catch Exception 
			System.out.println(e);
		}
	}

}
