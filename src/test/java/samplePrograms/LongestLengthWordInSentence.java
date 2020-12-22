package samplePrograms;

public class LongestLengthWordInSentence {

	public static void main(String[] args) {
		String str = "home sweet home hiiiiiii hi www seweet ddddddddd";
		
		String[] arr = str.split(" ");
		String maxLengthWord = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].length()>arr[0].length())
			{
				maxLengthWord = arr[i];
			}
		}
		System.out.println(maxLengthWord);
		

	}

}
