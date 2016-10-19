package lt.vcs.paskaita5;

/**
 * Created by JR on 2016.10.19.
 */
public class User {

    private String vardas;
    private String pavarde;
    private final String klasesVardas;

    /**
     * User klases konstruktorius
     * @param vardas - vardas
     * @param pavarde - pavarde
     */

    public User(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klasesVardas = this.getClass().getName();
    }

    public String toString(){
        String result = this.klasesVardas + ": " +
                "vardas: " + this.vardas +
                "pavarde: " + this.pavarde;
        return result;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getKlasesVardas() {
        return klasesVardas;
    }


}
