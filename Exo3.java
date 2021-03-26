import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        System.out.print("Donner un jour:");
        Scanner clavier=new Scanner(System.in);
        int j = clavier.nextInt();
        System.out.print("Donner un mois:");
        Scanner clavier2=new Scanner(System.in);
        int m = clavier2.nextInt();
        System.out.print("Donner une année:");
        Scanner clavier3=new Scanner(System.in);
        int a = clavier3.nextInt();
        if (((m==4 || m==6 || m==9 || m==11) && (0<j && j<=30)) || ((m==1 || m==3 || m==7 || m==8 || m==10 || m==12 || m==5) && (0<j && j<=31)) || ((m==2) && (0<j && j<=29)))
            System.out.println("la date "+j+'-'+m+'-'+a+" est valide");
        else
            System.out.println("la date "+j+'-'+m+'-'+a+" n'est pas valide");
    }
}
