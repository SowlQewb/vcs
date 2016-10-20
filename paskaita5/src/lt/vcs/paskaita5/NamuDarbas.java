package lt.vcs.paskaita5;

/**
 * Created by JR on 2016.10.20.
 */
public class NamuDarbas extends User {
    private String prekinisZenklas;

    public NamuDarbas(String prekinisZenklas){
        super("NamuDarbas");
        this.prekinisZenklas = prekinisZenklas;
    }

    public String getPrekinisZenklas() {
        return prekinisZenklas;
    }

    public void setPrekinisZenklas(String prekinisZenklas) {
        this.prekinisZenklas = prekinisZenklas;
    }

    @Override
    public String toString(){
        return super.toString() + " yra " + this.prekinisZenklas;
    }
}
