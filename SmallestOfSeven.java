public class SmallestOfSeven{
    public static void main(String[] args) {
        int a=51,b=26,c=53,d=56,e=85,f=39,g=49;
		int res,res1,res2,res3,res4,res5;
		res =a<b?a:b;
		res1=res<c?res:c;
		res2=res1<d?res1:d;
		res3=res2<d?res2:e;
		res4=res3<d?res3:f;
		res5=res4<d?res4:g;
		
    System.out.println( res5 + " is smallest");
        
    }
}