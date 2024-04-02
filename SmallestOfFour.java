public class SmallestOfFour{
    public static void main(String[] args) {
        int a=51,b=2,c=53,d=56;
		int res,res1,res2,res3;
		res =a<b?a:b;
		res1=res<c?res:c;
		res2=res1<d?res1:d;
		
    System.out.println( res2 + " is smallest");
        
    }
}