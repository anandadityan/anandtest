
public class multidimensionalArray {

	public static void main(String[] args) {
		
		int a[][]=new int [2][3];
		a[0][0]=2;
		a[0][1]=5;
		a[0][2]=9;
		a[1][0]=2;
		a[1][1]=5;
		a[1][2]=4;
		//System.out.println(a[0][2]);
		
		
	//	int b[][]= {{1,2,3},{4,5,6}};  // 1st row, 2nd row just like a matrix
		
		
		for(int i=0;i<2;i++) {  // outer for loop for row
				
		for(int j=0;j<3;j++)   // inner for loop for column
		{
		System.out.println(a[i][j]);
	}

		}
		
	}
}
	
	
	
