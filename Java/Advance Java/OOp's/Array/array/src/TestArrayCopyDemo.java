// Copying a Java Array

public class TestArrayCopyDemo {
	public static void main(String args[])
	{
		char[] copyFrom= {'a','b','c','d','e'};
		char[] copyTo=new char[7];
		System.arraycopy(copyFrom,1,copyTo,0,2);
		System.out.println(String.valueOf(copyTo));
			
		
	}

}
