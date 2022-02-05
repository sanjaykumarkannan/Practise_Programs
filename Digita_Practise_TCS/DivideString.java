public class DivideString{
    public static void main(String args[]){
        String inp="aaabbbccc";
        int n=3;
        int inp_length=inp.length();
        int noOfDividedStrings=0;
        String dividedStrings[];
        if(inp_length%n!=0){
            System.out.println("This string cannot be divided.");
        }
        else{
            noOfDividedStrings=inp_length/n;
            dividedStrings=new String[noOfDividedStrings];
            int index=0;
            for(int i=0;i<inp_length;i+=n){
                dividedStrings[index]="";
                for(int j=i;j<i+n;j++)    {
                    dividedStrings[index]+=inp.charAt(j);
                }
                index++;
            }
            for(int i=0;i<noOfDividedStrings;i++){
                System.out.println(dividedStrings[i]);
            }
        }
    }
}