import java.util.ArrayList;

public class Databaze {
    /*
    založení databáze záznamů
     */
    private ArrayList<Pojisteni> zaznamy;
     public Databaze(){
     zaznamy = new ArrayList<>();
     }

     /*
     přidání úplně nového pojištěného, je potřeba jméno, příjmení, věk a tel.číslo.
     Následně se uloží do seznamu zaznamy.
      */
     public void pridejPojisteneho(String jmeno, String prijmeni, int vek, int telefonniCislo){
         zaznamy.add(new Pojisteni(jmeno,prijmeni,vek,telefonniCislo));
     }

     /*
     Hledání pojištěného podle jeho jména a příjmení. Vrací seznam.
      */
     public ArrayList<Pojisteni> najdiPojisteneho(String jmeno, String prijmeni){
         ArrayList<Pojisteni> nalezene = new ArrayList<>();
         for(Pojisteni p : zaznamy){
             if(jmeno.equals(p.getJmeno())&&(prijmeni.equals(p.getPrijmeni()))){
                 nalezene.add(p);
             }
         }
         return nalezene;
     }

     /*
     Najde pojištěného pomocí předchozí funkce a následně ho odstraní ze seznamu záznamy.
      */
     public void vymazPojisteneho(String jmeno,String prijmeni){
         ArrayList<Pojisteni> nalezene = najdiPojisteneho(jmeno,prijmeni);
         for (Pojisteni p : nalezene){
             zaznamy.remove(p);
         }
     }

     /*
     zobrazí všechny pojištěné v seznamu
      */
     public void vypisPojistene(){
         for(Pojisteni p: zaznamy){
             System.out.println(p);;
         }
     }

}