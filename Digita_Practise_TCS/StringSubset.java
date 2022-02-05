public class StringSubset{
    public static void main(String args[]){
        String input="SANJAY";
        int input_length=input.length();
        int subset=1;
        String output="";
        while(subset<=input_length-1){
            for(int i=0;i<input_length;i++){
                if(i+subset<=input_length)   {
                    output+=input.substring(i,i+subset)+" , ";
                }
            }
            subset++;
        }
        System.out.println(output);
    }
}