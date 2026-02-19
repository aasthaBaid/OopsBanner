/**
@author developer
@version 7
*/
class OOPSBannerInnerClass{
	static class CharacterPattern{
		static String[] oPattern = {
			"    ***    ",
			" **     ** ",
			"**       **",
			"**       **",
			"**       **",
			"**       **",
			"**       **",
			" **     ** ",
			"    ***    "
		};
		static String[] pPattern = {
			" *******  ",
			" **    ** ",
			" **     **",
			" **    ** ",
			" ****     ",
			" **       ",
			" **       ",
			" **       ",
			" **       "
		};
		static String[] sPattern = {
			"   *****  ",
			"  **      ",
			" **       ",
			"  **      ",
			"   ***    ",
			"      ** ",
			"       **",
			"      ** ",
			"  ******  "
		};
		static String[] getPattern(char ch){
			switch(Character.toUpperCase(ch)){
				case 'O' : return oPattern;
				case 'P' : return pPattern;
				case 'S' : return sPattern;
				default : return  new String[] {
					" ",
					" ",
					" ",
					" ",
					" ",
					" ",
					" ",
					" ",
					" "
				};
			}
		}
	}
	public static void main(String[] args){
		String word = "OOPS";
		String del = " ";
		StringBuilder lines[] =new StringBuilder[9];
		
		for(int i = 0 ; i < 9; i++){
			lines[i] = new StringBuilder();
		}
		for (int i = 0; i < word.length(); i++) {
            String[] pat = CharacterPattern.getPattern(word.charAt(i));
            for (int r = 0; r < 9; r++) {
                lines[r].append(pat[r]);
            }
            if (i < word.length() - 1) {
                for (int r = 0; r < 9; r++) lines[r].append(del);
            }
        }
		for(int i = 0 ; i < 9 ;i++){
			System.out.println(lines[i]);
		}
	}
}

/*
class OOPSBannerInnerClass{
	public static void main(String[] args){
		Mobile.Battery battery = new Mobile().new Battery();
		battery.showBattery();
	}
}
class Mobile {
	String brand = "Apple";
	class Battery{
		public void showBattery(){
			System.out.println("Brand : " + brand);
		}
	}
}

class OOPSBannerInnerClass{
	public static void main(String[] args){
		Mobile.Battery battery = new Mobile.Battery();
		battery.showBattery();
	}
}
class Mobile {
	static String brand = "Apple";
	// if class is static, it cannot call non static variable, the variable has to be static
	static class Battery{
		public void showBattery(){
			System.out.println("Brand : " + brand);
		}
	}
}
*/


