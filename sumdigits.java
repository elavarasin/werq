public class sum1 {
	public static void main(String[] args) {
		int c=Integer.parseInt(args[0]);
		int rev=0,b,sum=0;
	while(c!=0){
		rev=c;
		while(rev!=0){
			b=rev%10;
			sum=sum+b;
			rev=rev/10;
			}
		c=c/10;
	}
	System.out.println(sum);
}	
		
}	
