import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int f=0,sum=0;
      while(num>0)
      {
        f=num%10;
        
        num=num/10;
        sum=sum+f;
      }
      System.out.println(sum);
	}
}