package sorting;

import java.util.ArrayList;
import java.util.Collections;
/*A class must implement the comparable interface if sorting required on collection of objects,
but, for comparator we don’t need to implement it.
By using comparator, objects can be sorted based on more than one fields of a class.
Whereas Comparable allows you to sort items in a collections based on only one field.*/

class Song implements Comparable<Song>
{

	String title;
	String singer;
	int year;
	
	public Song(String title, String singer, int year) {
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

	@Override
	public int compareTo(Song anotherSong) {
		
		return this.getSinger().compareTo(anotherSong.getSinger());

	}
	
}

public class SortListForUserDefinedObject {

	public static void main(String[] args) {
		Song s1 = new Song("Dil hai ki Manta nehin","Anuradha",1998);
		Song s2 = new Song("Bahut Pyar karte hain","Alka",1998);
		Song s3 = new Song("Lagja gale ke ","Lata",1942);
		
		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(s1);
		songList.add(s2);
		songList.add(s3);
		
		for(Song song:songList)
		{
			System.out.println(song);
		}
		System.out.println("***********");
		Collections.sort(songList);
		for(Song song:songList)
		{
			System.out.println(song);
		}

	}

}
