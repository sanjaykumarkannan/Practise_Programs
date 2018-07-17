class DiamondPattern
{
  public static void main(String args[])
  {
    int n=3;
    for(int i=0;i<n;i++)
    {
      for(int k=0;k<n-1-i;k++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
    for(int i=n;i>0;i--)
    {
      for(int k=i;k<n;k++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<i;j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
