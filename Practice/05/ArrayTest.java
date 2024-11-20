
public class ArrayTest {

	static void inc(int num)
	{
		num++;
		System.out.print(num + " ");
	}
	
	static void inc(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
			arr[i]++;
	}
	
	public static void main(String[] args) {
	
		int[] arr = {1, 2, 3};
		
		for (int i = 0; i < arr.length; i++)
			inc(arr[i]);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		inc(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
