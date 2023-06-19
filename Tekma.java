import java.util.Arrays;

public class Tekma {
    private Uvrstitev[] uvrstitve;
    private double[] rezultati = new double[3];

    public Tekma(Uvrstitev[] uvrstitve) {
        this.uvrstitve = uvrstitve;
    }

    /*public int steviloTekmovalcev() {
        return uvrstitve.length();
    }*/

    private double razvrstitev(int n) {
        for (int i = 0; i < uvrstitve.length; i++) {
            rezultati[i] = uvrstitve[i].getSkupnicas();
        }
        Arrays.sort(rezultati);
        return rezultati[n];
    }

    public void izpisiUvrstitve() {
        for (int i = 0; i < uvrstitve.length; i++) {
            for (int j = 0; j < uvrstitve.length; j++) {
                if(razvrstitev(i) == uvrstitve[j].getSkupnicas()) {
                    System.out.println(i+1 + ". mesto: " + uvrstitve[j].getPovzetek());
                }
            }
        }
    }
}