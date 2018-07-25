
public class ArraySum {

	public static void main(String[] args) {
		
		
		int c[] = {2,3,5,7,8};
		
		int sum = 0;
		for(int i = 0;i<c.length;i++) {	
		sum=sum+c[i];
		if(c[i]==8)
		{
			
		System.out.println(i); // index of value 8 
			
		}
		
				}
		
		System.out.println(sum);
					}

}
