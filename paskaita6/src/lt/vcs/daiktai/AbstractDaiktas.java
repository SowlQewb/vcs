package lt.vcs.daiktai;

import lt.vcs.interfeisai.Daiktas;
import lt.vcs.interfeisai.VcsEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JR on 2016.10.20.
 */
public abstract class AbstractDaiktas implements Daiktas, VcsEntity {
    private String name;
    private Date purchasedate;

    public AbstractDaiktas (String name, Date purchasedate){
        this.name = name;
        this.purchasedate = purchasedate;
    }

    public String getName(){
        return name;
    }
    public Date getPurchaseDate(){
        return purchasedate;
    }
    public String getId() {
        SimpleDateFormat sdf = new SimpleDateFormat("'['ss:mm:HH']' ");
        return name + "-" + sdf.format(purchasedate);
    }
}
