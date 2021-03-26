import java.util.Scanner;
public class Exo1
{
    public static void main(String[] args) {
        System.out.print("Donner un nombre:");
        Scanner clavier=new Scanner(System.in);
        int nbr = clavier.nextInt();
        if((nbr%400==0) || (nbr%100!=0 && nbr%4==0))
            System.out.println(nbr+" est une année bissextile");
        else
            System.out.println(nbr+" n'est pas une année bissextile");        
    }
}