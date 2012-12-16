package testpack;

import java.io.*;
import java.util.ArrayList;

public class StorageStructure {
	
	public int SizeX = 0;
	public int SizeY = 0;
	
	int i = 0;
	String str = null;
	
	char[] map_char_add = new char [SizeX];
	char[][] map_char = new char [SizeX][SizeY];
	
	@SuppressWarnings("resource")
	public void LoadMapConfigFromText() {
		
		int k = 0;
		int m = 0;
				
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		try {
			BufferedReader br = new BufferedReader (new FileReader ("map_cfg.txt")); 
			while( (str = br.readLine()) != null) {
				i++;
				k = i;} 
			while( (str = br.readLine()) != null) {
				i++;
				ar.add(i, str.length());
			for (i = 0; i<ar.size(); i++) {
				if (ar.get(i)> m) {
				m = ar.get(i);
				}
			}
			}			
			
		}  catch (IOException e) {
			e.printStackTrace();
		}
	
		SizeX = k;
		SizeY = m;		
	}
	
	@SuppressWarnings("resource")
	public void LoadMapContentsFromText() {
		
		StringBuffer char_buf = new StringBuffer();
		
		char[] map_char_add = new char [SizeX];
		char[][] map_char = new char [SizeX][SizeY];
			
		try {
			BufferedReader br = new BufferedReader (new FileReader ("map_cfg.txt")); 
		
		while( (str = br.readLine()) != null) {
			char_buf.replace(0, 1, str); }
			char_buf.getChars(0, char_buf.length(), map_char_add, 0);
			map_char[i][0] = map_char_add[i];
			i++;
		
	} catch (IOException e) {
		e.printStackTrace();
	}}
	
	public void PrintMapContents() {
		for (i = 0; i < map_char.length; i++)
			for (int j = 0; j <map_char[i].length; j++) {
				System.out.println(map_char[i][j]);
			}
	}
	
	public void InitDimension(int width, int height) {
		
		SizeX = width;
		SizeY = height;		
	}	
}
