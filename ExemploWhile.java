public class ExemploWhile{
    public static void main (String args[]){

        if (args.length>0){
            int j = Integer.parseInt (args[0]);
            while (j >= 0){
                System.out.println (j);
                j--;
            }
        }
    }
}