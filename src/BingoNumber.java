import java.security.SecureRandom;

public class BingoNumber {
    int[] r = new int[75];
    int i;
    public BingoNumber() {
        for (int i = 0; i < 75; i++) {
            r[i] = i + 1;
        }
        SecureRandom rndint = new SecureRandom();
        for (int i = 0; i < 1000; i++) {
            int rng1 = rndint.nextInt(75);
            int rng2 = rndint.nextInt(75);
            int a = r[rng1];
            int b = r[rng2];
            r[rng1] = b;
            r[rng2] = a;
        }
    }
    public int NewNumber (){
        return r[i++];
    }
}
