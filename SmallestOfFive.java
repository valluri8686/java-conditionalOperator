class SmallestOfFive{
	public static void main(String[] args) {
		int a=10,b=30,c=50,d=40,e=90;
		if (a<b && a<c && a<d && a<e )
		{
			System.out.println("a is smallest");
		}
		else if(b<a && b<c && b<d && b<e ){
			System.out.println("b is smallest ");
		}
		else if(c<a && c<b && c<d && c<e){
			System.out.println("c is smallest");
		}
		else if(d<a && d<b && d<c && d<e){
			System.out.println("d is smallest");
		}
		else if(e<a && e<b && e<c && e<d){
			System.out.println("e is smallest");
		}
	}
}
