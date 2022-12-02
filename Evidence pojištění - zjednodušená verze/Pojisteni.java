public class Pojisteni {
    /*
    vytvoření povinných atributů
     */
    private String jmeno;
    private  String prijmeni;
    private int vek;
    private int telefonniCislo;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getTelefonniCislo() {
        return telefonniCislo;
    }

    public void setTelefonniCislo(int telefonniCislo) {
        this.telefonniCislo = telefonniCislo;
    }

   /*
   založení konstruktoru
    */
    public Pojisteni(String jmeno, String prijmeni, int vek, int telefonniCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    /*
    umožnění výpisu třídy Pojisteni.java
     */
    @Override
    public String toString() {
        return jmeno + "   " + prijmeni + "   " + vek + "   " + telefonniCislo;
    }
}
