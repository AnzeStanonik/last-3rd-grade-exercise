public class Uvrstitev {

    private Smucar smucar;
    private double cas1;
    private double cas2;
    private double[] prviDrugiCas = new double[2];

    public Uvrstitev(Smucar smucar) {
        this.smucar = smucar;
    }

    public double getSkupnicas() {
        return cas1 + cas2;
    }

    public void setPrviCas(double cas) {
        cas1 = cas;
    }

    public void setDrugiCas(double cas) {
        cas2 = cas;
    }

    public void setCas(double[] prviDrugiCas) {
        cas1 = prviDrugiCas[0];
        cas2 = prviDrugiCas[1];
    }

    public String getPovzetek() {
        return smucar.getImePriimek() + " "+ smucar.getDrzava() + " prvi cas: " + cas1 + ", drugi cas: " + cas2;
    }

}