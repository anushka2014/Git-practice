import java.util.Arrays;

public  class practicegit {
	
	
	public static int Findmax(int a[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i =0;i<a.length;i++)
		{
			if (max < a[i])
			max= a[i];
		}
		System.err.println(max);
		
		return max;
	}
	public static int[] Arrayreturnn()
	{
//		int a[] = {1,2,3,4,5};
//		return a;
		//or
		return new int[] {1,2,3,4,5};
	}
	

	public static void main(String[] args) {
	
		int b[]= {10,20,20,39,10926982,226567,99,2};
		
		practicegit maximum = new practicegit();
		int highst = maximum.Findmax(b);
//		System.out.println(highst);
		
		
		System.out.println(Arrays.toString(maximum.Arrayreturnn()));
		
		

	}

}