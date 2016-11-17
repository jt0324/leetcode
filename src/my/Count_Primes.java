package my;

/**
 * Created by dean on 16/11/17.
 */
public class Count_Primes {
    public int countPrimes(int n) {
        boolean[] m = new boolean[n];
        int count = 0;
        for (int i=2; i<n; i++) {
            if (m[i])
                continue;
            count++;
            for (int j=i; j<n; j=j+i)
                m[j] = true;
        }
        return count;
    }

    public static void main(String[] args) {
        Count_Primes c = new Count_Primes();
        c.countPrimes(10);
    }
}
