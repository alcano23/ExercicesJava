import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        System.out.print("Donner une année:");
        Scanner clavier=new Scanner(System.in);
        int a = clavier.nextInt();
        System.out.print("Donner un mois:");
        Scanner clavier2=new Scanner(System.in);
        int m = clavier2.nextInt();
        if (m==4 || m==6 || m==9 || m==11){
            System.out.println(m+" compte 30 jours en l'année "+a);}
        else if (((a%400==0) || (a%100!=0 && a%4==0)) && m==2){
            System.out.println(m+" compte 29 jours en l'année "+a);}
        else if (m==2){
            System.out.println(m+" compte 28 jours en l'année "+a);}
        else if (m==1 || m==3 || m==7 || m==8 || m==10 || m==12 || m==5){
            System.out.println(m+" compte 31 jours en l'année "+a);}
        else 
            System.out.println(m+" n'est pas un mois valide");
        switch(m){
            case 1 : System.out.println("Lundi");break;
            case 2 : System.out.println("Mardi");break;
            case 3:System.out.println("Mercredi");break;
            default:System.out.println("Autrement");break;
        }
        
    }
}
