/*3 . TWISTED PRIME NUMBER

A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number.

Input : 97
Output : Twisted Prime Number
Explanation: 97 is a prime number
and its reverse 79 is also a prime
number.*/
class TwistedPrime
{
  public void primeornot(int num)
  {
    int mid=num/2;
    for (int i=2;i<=mid;i++)
    {
      if(num%i==0)
      {
        System.out.println(num+" is not a twisted prime number.");
        return;
      }
    }
    int rev=0;
    int num1=num;
    int d;
    while(num1>0)
    {
      d=num1%10;
      rev=rev*10+d;
      num1=num1/10;
    }
    mid=rev/2;
    for (int i=2;i<=mid;i++)
    {
      if(rev%i==0)
      {
        System.out.println(num+" is not a twisted prime number.");
        return;
      }
    }
    System.out.println(num+" is a twisted prime number!");
  }
  public static void main(String args[])
  {
    TwistedPrime tp=new TwistedPrime();
    int num=123;
    tp.primeornot(num);
  }
}
