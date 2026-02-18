/*
@author developer
@version 5
*/
class OOPSBannerAppArray{
	public static void main(String[] args){
		// continuous memory to store elements
		String arr[] = {
			String.join(" ","    ***    " , "     ***    " , " *******  " , "   *****  "),
			String.join(" "," **     ** " , "  **     ** " , " **    ** " , "  **      "),
			String.join(" ","**       **" , " **       **" , " **     **" , " **       "),
			String.join(" ","**       **" , " **       **" , " **    ** " , "  **      "),	
			String.join(" ","**       **" , " **       **" , " ****     " , "   ***    "),
			String.join(" ","**       **" , " **       **" , " **       " , "      ** "),
			String.join(" ","**       **" , " **       **" , " **       " , "       **"),
			String.join(" "," **     ** " , "  **     ** " , " **       " , "      ** "),
			String.join(" ","    ***    " , "     ***    " , " **       " , "  ******  ")
		};
		
		for(String str : arr){
			System.out.println(str);
		}
		
	}
}