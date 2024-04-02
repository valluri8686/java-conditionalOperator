class SpecialCharOrNot{
	public static void main(String[] args) {
		char ch='A';
		if ((ch>=' '&& ch<='@')||(ch>='['&& ch<='~'))
		{
			System.out.println("special character");
		}
		else{
			System.out.println("not a special character");
		}
	}
}
