package lt.vcs;

import lt.vcs.paketas.PaketoKlase;
import lt.vcs.paskaita5.User;
import lt.vcs.users.Albinas;
import lt.vcs.users.Justinas;

public class Main {

    public static void main(String[] args) {
	// lt.vcs.Main klase
        User justinas = new Justinas("tinginiauti");
        User useris = new User("vardauskas", "pavardauskas");
        User pk = new Justinas("tekstas");
        if (justinas instanceof Justinas){  //ar Justinas yra esybe instance klase?
            VcsUtils.println("Justinas uraaaa!");
            Justinas tikraiJustinas = (Justinas)justinas;
            VcsUtils.println(tikraiJustinas.getHobis());
        }
        if (pk instanceof User){
            VcsUtils.println("paketas uraa!");
        }
        VcsUtils.println((useris).toString());
        VcsUtils.println((justinas).toString());

        User albinas = new Albinas("zalias");
        User albinuks = new User("vardauskas", "pavardauskas");
        VcsUtils.println((albinuks).toString());
        VcsUtils.println((albinas).toString());
    }
}
