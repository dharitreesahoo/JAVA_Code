package CoreJavaExamples.CoreJavaExamples;

public class ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 4, 5, 6, 7, 7, 7, 7 };
		int arr2[] = { 4, 4, 5, 6, 7, 7, 7, 7};
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
				}
			}
		} else {
			flag = false;
		}

		if (flag) {
			System.out.println("Arrays  equal");
		} else {
			System.out.println("Arrays not equal");
		}

	}

}
