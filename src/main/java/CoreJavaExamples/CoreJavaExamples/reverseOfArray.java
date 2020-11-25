package CoreJavaExamples.CoreJavaExamples;

public class reverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 4, 5, 6, 7, 7, 7,7 };
		for(int i=0;i<arr1.length/2;i++)
		{
			int temp =  arr1[i];
			arr1[i]=arr1[arr1.length-1-i];
			arr1[arr1.length-1-i]= temp;
		}
		for(int ele:arr1)
		{
			System.out.println(ele);
		}
	}

}
