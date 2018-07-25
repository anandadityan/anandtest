
public class ArrayMinimumnumber {

	public static void main(String[] args) {
	
int b[][]= {{7,9,3},{4,5,6},{1,2,3}};  // 1st row, 2nd row just like a matrix
		
int sum = b[0][0];
		
		for(int i=0;i<3;i++)
		{  // outer for loop for row
		
			for(int j=0;j<3;j++)   // inner for loop for column
		    {
							
		       if((b[i][j])<sum)
		       {
			   sum = b[i][j];
			   }
		
		    }			
	}
		System.out.println(sum);

}
}
