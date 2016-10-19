package lt.vcs.users;

import lt.vcs.paskaita5.User;

/**
 * Created by JR on 2016.10.19.
 */
public class Albinas extends User {

    private String spalva;

    public Albinas(String spalva){
        super("Albinas");
        this.spalva = spalva;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    @Override
    public String toString(){
        return super.toString() + " yra " + this.spalva;
    }
}
