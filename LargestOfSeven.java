public class LargestOfSeven
{
    public static void main(String[] args) {
        int a=5,b=2,c=53,d=8,e=1,f=6,g=7;
		int res,res1,res2,res3,res4,res5;
		res =a>b?a:b;
		res1=res>c?res:c;
		res2=res1>d?res1:d;
		res3=res2>e?res2:e;
		res4=res3>f?res3:f;
		res5=res4>g?res4:g;
		

 
    System.out.println( res5 + " is largest");
        
    }
}