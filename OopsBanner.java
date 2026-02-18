/*
@author developer
@version 4
*/
class OOPSBannerArray{
	public static void main(String[] args){
		// continuous memory to store elements
		String arr[] = new String[9];
		//by default, all is intialised with 0
		
		
		arr[0] = String.join(" ","    ***    " , "     ***    " , " *******  " , "   *****  ");
		arr[1] = String.join(" "," **     ** " , "  **     ** " , " **    ** " , "  **      ");
		arr[2] = String.join(" ","**       **" , " **       **" , " **     **" , " **       ");
		arr[3] = String.join(" ","**       **" , " **       **" , " **    ** " , "  **      ");	
		arr[4] = String.join(" ","**       **" , " **       **" , " ****     " , "   ***    ");
		arr[5] = String.join(" ","**       **" , " **       **" , " **       " , "      ** ");
		arr[6] = String.join(" ","**       **" , " **       **" , " **       " , "       **");
		arr[7] = String.join(" "," **     ** " , "  **     ** " , " **       " , "      ** ");
		arr[8] = String.join(" ","    ***    " , "     ***    " , " **       " , "  ******  ");
		
		for(String str : arr){
			System.out.println(str);
		}
		
	}
}