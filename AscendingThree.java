class AscendingThree 
{
	public static void ascend(int a,int b,int c){
      
		int	asc1,asc2,asc3;
		 if (a<b && a<c){
				asc1=a;
				System.out.println(asc1);
			 }
			 else if (b<a && b<c)
			 {
				  asc1=b;
				  System.out.println(asc1);
			 }
			 else if (c<a && c<b)
			 {
				  asc1=c;
				  System.out.println(asc1);
			 }
		

		 if (a<b && a>c || a>b && a<c){
				 asc2=a;
				 System.out.println(asc2);
			 }
			 else if (b<a && b>c|| b>a && b<c)
			 {
				  asc2=b;
				  System.out.println(asc2);
			 }
			 else if (c<a && c<b || c>a && c<b)
			 {
				  asc2=c;
				  System.out.println(asc2);
			 }
		

		if (a>b && a>c){
				 asc3=a;
				 System.out.println(asc3);
			 }
			 else if (b>a && b>c){
				  asc3=b;
				  System.out.println(asc3);
			 }
			 else if (c>a && c>b){
				  asc3=c;
				  System.out.println(asc3);
			 }
	
	}
	public static void main(String[] args) 
	{
		ascend(34,14,43);
	}
}
