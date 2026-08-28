import java.util.*;
public class ExTratamentoErro4{
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);
        int soma = 0;
        try{
            int i = Integer.parseInt(args[0]);
            System.out.println("i="+i);
            System.out.println("Digite um inteiro j=");
            int j = s.nextInt();
            soma = i + j;
            System.out.println("Soma (i+j)=" + soma);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
    }
}