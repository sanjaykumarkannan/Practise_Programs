class Palindrome
{
  public static void main(String args[])
  {
    String str="did i",rev="";
    int index=str.length()-1;
    for(int i=index;i>=0;i--)
    {
      rev+=str.charAt(i);
    }
    if(str.equals(rev))
    {
      System.out.println("It is a palindrome.");
    }
    else
    {
      System.out.println("String is not a palindrome.");
    }
    System.out.println(str);
    System.out.println(rev);
  }
}
