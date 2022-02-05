public class StringReverse{
    public static void main(String args[])
    {
        String name="Sanjay",revString="";
        for(int i=name.length()-1;i>=0;i--){
            revString+=name.charAt(i);
        }
        System.out.println(revString);        
    }
}