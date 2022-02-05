public class RecursiveFactorial{
    public static void main(String args[]){
        int n=5;
        System.out.println(findFactorial(n));
    }
    public static int findFactorial(int n){
        if (n==1){
            return 1;
        }
        else{
            return n*findFactorial(n-1);
        }
    }
    
}