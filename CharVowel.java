class CharVowel {
	public static void main(String[] args) {
		charVowel('a');
	}
	public static void charVowel(char ch){
		if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
			switch(ch){
				case 'a':{
							System.out.println("vowel");
							break;
						 }
				case 'e':{
							System.out.println("vowel");
							break;
						 }
				case 'i':{
							System.out.println("vowel");
							break;
						 }
				case 'o':{
							System.out.println("vowel");
							break;
						 }
				case 'u':{
							System.out.println("vowel");
							break;
						 }
				case 'A':{
							System.out.println("vowel");
							break;
						 }
				case 'E':{
							System.out.println("vowel");
							break;
						 }
				case 'I':{
							System.out.println("vowel");
							break;
						 }
				case 'O':{
							System.out.println("vowel");
							break;
						 }
				case 'U':{
							System.out.println("vowel");
							break;
						 }
			    default :{
							System.out.println("not a vowel");
							break;
						 }
			}
		}
		else {
			System.out.println("Not a alphabet");
		}
	}

}
