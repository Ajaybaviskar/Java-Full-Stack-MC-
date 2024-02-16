
public class NarrowingTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=1666.66;
		long l=(long) d;
		int i=(int) l;
		System.out.println("Before Converting to Long : "+d);
		System.out.println("After Converting to long : "+l);
		System.out.println("After Converting to int "+i);
		

	}

}
