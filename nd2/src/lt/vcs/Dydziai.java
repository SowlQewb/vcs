package lt.vcs;

/**
 * Created by JR on 2016.10.14.
 */
public enum Dydziai {

    SMALL("mazas", "small"),
    MEDIUM("vidutinis", "medium"),
    LARGE("didelis", "large");

    public String getLt() {
        return lt;
    }

    private final String lt;

    public String getEn() {
        return en;
    }

    private final String en;

    private Dydziai(String lt, String en) {
        this.lt = lt;
        this.en = en;
    }
}
