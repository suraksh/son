package comparable.son;

import java.util.* ;
import java.io.*;

public class ArrayListExample {

	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args){
		ArrayListExample example = new ArrayListExample();
		example.start();
		Integer i = 0;
	}
	
	void start(){
		parseFile();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	
	void parseFile(){
		try{
			File file = new File("C:\\D_DRIVE\\HOME_WORKSPACE\\Basic\\src\\songlist.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null){
				addSong(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	void addSong(String lineToParse){
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
