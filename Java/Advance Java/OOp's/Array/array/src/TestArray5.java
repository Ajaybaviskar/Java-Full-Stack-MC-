// Addition of 2 Matrix in Java
public class TestArray5 {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,2,3},{4,5,6}};
		
		int c[][]=new int[2][3];
		// adding and printing add 2 matrix
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");				
			}
			System.out.println();			
		}
	}
}
