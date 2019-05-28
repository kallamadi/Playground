import java.util.Scanner;
class Main
{
  public static int suq(int m)
  {
    m=m*m;
    return m;
  }
	public static void main (String[] args)
    {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=suq(n);
      System.out.println(s);
	} 
}