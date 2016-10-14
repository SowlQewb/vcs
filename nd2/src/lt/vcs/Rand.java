package lt.vcs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by JR on 2016.10.14.
 */
public class Rand {

    public static void main(String[] args) {
        //-------------------------------------------------
        //  [0; 5)
        for (int i = 0; i < 5 ; i++) {
            int random = ThreadLocalRandom.current().nextInt(5, 10 + 1);
            VcsUtils.println("" + random);
        }


        //-------------------------------------------------
    }//main end
}
