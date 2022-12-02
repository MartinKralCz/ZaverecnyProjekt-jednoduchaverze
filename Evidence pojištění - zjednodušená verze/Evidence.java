import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Evidence {
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in,"Windows-1250");

    public Evidence(){
        databaze = new Databaze();
    }
/*
uživatel bude dotázán na zadání jména, příjmení, věk a tel.čísla
 */
    private String zjistiJmeno(){
        System.out.println("Zadejte jméno pojištěného:");
        while (true){
            try{
                return sc.nextLine().trim();
            } catch (Exception ex){
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }

    }

    private String zjistiPrijmeni(){
        System.out.println("Zadejte příjmení pojištěného:");
        while (true){
            try{
                return sc.nextLine().trim();
            } catch (Exception ex){
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }

    private int zjistiVek(){
        System.out.println("Zadejte věk:");
        while (true){
            try{
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex){
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }

    private int zjistiTelefonniCislo(){
        System.out.println("Zadejte telefonní číslo?");
        while (true){
            try{
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex){
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }
    /*
    vypíše úvodní obrazovku do konzole
     */
    public void vypisUvodniObrazovku(){
        System.out.println("------------------------------");
        System.out.println("     Evidence pojištěných     ");
        System.out.println("------------------------------");
        System.out.println();
    }

    /*
    vypíše všechny v evidenci
     */
    public void vypisEvidenci(){
        databaze.vypisPojistene();
        System.out.println();
    }

    /*
    přidání záznamu do evidence
     */
    public void pridejZaznam(){
        String zadaneJmeno = zjistiJmeno();
        String zadanePrijmeni = zjistiPrijmeni();
        int zadanyVek = zjistiVek();
        int zadaneTelCislo = zjistiTelefonniCislo();
        databaze.pridejPojisteneho(zadaneJmeno,zadanePrijmeni,zadanyVek,zadaneTelCislo);
        System.out.println("");
        System.out.println("Data byla uložena do evidence.");
        System.out.println();
    }

    /*
    vyhledání záznamu v evidenci
     */
    public void vyhledatZaznam(){
        String zadaneJmeno = zjistiJmeno();
        String zadanePrijmeni = zjistiPrijmeni();
        ArrayList<Pojisteni> zaznamy = databaze.najdiPojisteneho(zadaneJmeno,zadanePrijmeni);
        if (zaznamy.size()>0){
            System.out.println("Nalezen tento záznam:");
            for(Pojisteni p : zaznamy){
                System.out.println(p);
            }
        } else {
            System.out.println("Nenalezen žádný záznam");
        }
        System.out.println();

    }

    /*
    vyhledá záznam a následně ho vymaže
     */
    public void vymazZazanam(){
        String zadaneJmeno = zjistiJmeno();
        String zadanePrijmeni = zjistiPrijmeni();
        ArrayList<Pojisteni> zaznamy = databaze.najdiPojisteneho(zadaneJmeno,zadanePrijmeni);
        if (zaznamy.size()>0){
            System.out.println("Vymazán tento záznam:");
            for(Pojisteni p : zaznamy){
                System.out.println(p);
                databaze.vymazPojisteneho(p.getJmeno(),p.getPrijmeni());
            }
        } else {
            System.out.println("Nenalezen žádný záznam");
        }
        System.out.println();
    }

}
