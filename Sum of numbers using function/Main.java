import java.util.Scanner;
class Main
{
  public static int suq(int m)
  {
    int sum=0;
    for( int i=1;i<=m;i++)
    {
      sum=i+sum;
    }
    return sum;
    
  }
	public static void main (String[] args)
    {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=suq(n);
      System.out.println(s);
	} 
}