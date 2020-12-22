package samplePrograms;

public class Palidrome {

	public static void main(String[] args) {
		String str =  "santosh";
		int l=str.length();
		boolean flg=true;
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==str.charAt(l-1)))
			{
				flg=  false;
				break;
			}
			l--;
		}
		if(flg)
		{
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not a  palindrome");
		}

	}

}
