
/**
@author developer
@version 8
*/
import java.util.*;
class OopsBannerHash {
	public static HashMap<Character, String[]> createHashMap(){
		HashMap<Character, String[]> charMap = new HashMap<>();
		charMap.put('O' , new String[] {
			"    ***    ",
			" **     ** ",
			"**       **",
			"**       **",
			"**       **",
			"**       **",
			"**       **",
			" **     ** ",
			"    ***    "
		});
		charMap.put('P' , new String[] {
			" *******  ",
			" **    ** ",
			" **     **",
			" **    ** ",
			" ****     ",
			" **       ",
			" **       ",
			" **       ",
			" **       "
		});
		charMap.put('S' , new String[] {
			"   *****  ",
			"  **      ",
			" **       ",
			"  **      ",
			"   ***    ",
			"      ** ",
			"       **",
			"      ** ",
			"  ******  "
		});
		return charMap;
		
	}
	
	public static void display(String message, HashMap<Character, String[]> charMap){
		int len = charMap.get('O').length;
		
		for(int i = 0 ; i < len; i++){
			System.out.println(charMap.get('O')[i] + " " + charMap.get('O')[i] + " " + charMap.get('P')[i] + " " + charMap.get('S')[i] );
		}
	}
	public static void main(String[] args){
		String word = "OOPS";
		HashMap<Character, String[]> charMap = createHashMap();
		display(word , charMap);
	}
}