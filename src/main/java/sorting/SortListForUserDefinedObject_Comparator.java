package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*A class must implement the comparable interface if sorting required on collection of objects,
but, for comparator we don’t need to implement it.
By using comparator, objects can be sorted based on more than one fields of a class.
Whereas Comparable allows you to sort items in a collections based on only one field.*/

class SongNew
{

	String title;
	String singer;
	int year;
	
	public SongNew(String title, String singer, int year) {
		super();
		this.title = title;
		this.singer = singer;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", year=" + year + "]";
	}


}
class SortBySinger implements Comparator<SongNew>
{

	@Override
	public int compare(SongNew obj1, SongNew obj2) {
		return obj1.getSinger().compareTo(obj2.getSinger());
	
	}


}
class SortByTitle implements Comparator<SongNew>
{

	@Override
	public int compare(SongNew obj1, SongNew obj2) {
		return obj1.getTitle().compareTo(obj2.getTitle());
	
	}


}

public class SortListForUserDefinedObject_Comparator {

	public static void main(String[] args) {
		SongNew s1 = new SongNew("Dil hai ki Manta nehin","Anuradha",1998);
		SongNew s2 = new SongNew("Bahut Pyar karte hain","Alka",1998);
		SongNew s3 = new SongNew("Lagja gale ke ","Lata",1942);
		
		ArrayList<SongNew> songListNew = new ArrayList<SongNew>();
		songListNew.add(s1);
		songListNew.add(s2);
		songListNew.add(s3);
		
		for(SongNew song:songListNew)
		{
			System.out.println("Unsorted---"+song);
		}
		System.out.println("\nSorted by Singer");
		Collections.sort(songListNew , new SortBySinger());
		for(SongNew song:songListNew)
		{
			System.out.println(song);
		}
		Collections.sort(songListNew , new SortByTitle());
		System.out.println("\nSorted by Title");
		for(SongNew song:songListNew)
		{
			System.out.println(song);
		}
		

	}

}
