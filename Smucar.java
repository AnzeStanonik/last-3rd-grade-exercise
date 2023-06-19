public class Smucar {
    private String imePriimek;
    private int starost;
    private Reprezentanca rep;

    public Smucar(String imePriimek, int starost, Reprezentanca rep) {
        this.imePriimek = imePriimek;
        this.starost = starost;
        this.rep = rep;
    }

    public String getImePriimek() {
        return imePriimek;
    }

    public int getStarost() {
        return starost;
    }

    public String getDrzava() {
        return rep.getDrzava();
    }
}