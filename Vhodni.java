public class Vhodni {
    public static void main(String[] args) {
        Reprezentanca rep1 = new Reprezentanca("ANG", "Anglija");
        Reprezentanca rep2 = new Reprezentanca("NEM", "Nemcija");
        Reprezentanca rep3 = new Reprezentanca("SLO", "Slovenija");
        Smucar smucar1 = new Smucar("Marko Oblak", 23, rep1);
        Smucar smucar2 = new Smucar("Ivan Cankar", 45, rep2);
        Smucar smucar3 = new Smucar("Jan Prevc", 19, rep3);
        Uvrstitev[] uvrstitve = new Uvrstitev[3];
        uvrstitve[0] = new Uvrstitev(smucar1);
        uvrstitve[1] = new Uvrstitev(smucar2);
        uvrstitve[2] = new Uvrstitev(smucar3);
        double[] cas1 = new double[] {222.22, 231.11};
        double[] cas2 = new double[] {123.12, 111.13};
        double[] cas3 = new double[] {342.22, 361.12};
        uvrstitve[0].setCas(cas1);
        uvrstitve[1].setCas(cas2);
        uvrstitve[2].setCas(cas3);
        Tekma tekma = new Tekma(uvrstitve);
        tekma.izpisiUvrstitve();
    }
}