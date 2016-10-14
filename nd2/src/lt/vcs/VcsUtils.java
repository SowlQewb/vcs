package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JR on 2016.10.14.
 */
public class VcsUtils {

    /**
     * Metodas isveda nauja eilute i cmd su laiku priekyje
     */
    public static void println(String text){
        Date data = new Date();
        String formatas = "'['HH:mm:ss:SS']' ";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        System.out.println(sdf.format(data) + text);
    }


}
