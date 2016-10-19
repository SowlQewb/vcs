package lt.vcs;

import lt.vcs.paskaita5.User;

public class Main {

    public static void main(String[] args) {
	// lt.vcs.Main klase

        VcsUtils.println((new User("vardauskas", "pavardauskas")).toString());
    }
}
