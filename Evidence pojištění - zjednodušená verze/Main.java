import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        Evidence evidence = new Evidence();
        String volba = "";

        while (!volba.equals("5")){
            evidence.vypisUvodniObrazovku();
            System.out.println("Vyber si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Vymazat záznam");
            System.out.println("5 - Konec");
            System.out.print("Vaše volba: ");
            volba = sc.nextLine();
            System.out.println();
            switch (volba){
                case "1":
                    evidence.pridejZaznam();
                    break;
                case "2":
                    evidence.vypisEvidenci();
                    break;
                case "3":
                    evidence.vyhledatZaznam();
                    break;
                case "4":
                    evidence.vymazZazanam();
                    break;
                case "5":
                    System.out.println("Ukončuji program...");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}
