public class LargestOfFive{
    public static void main(String[] args) {
        int a=5,b=2,c=53,d=8,e=1;
		int res,res1,res2,res3;
		res =a>b?a:b;
		res1=res>c?res:c;
		res2=res1>d?res1:d;
		res3=res2>e?res2:e;
    System.out.println( res3 + " is largest");
        
    }
}