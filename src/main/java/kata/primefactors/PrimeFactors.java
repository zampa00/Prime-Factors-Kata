package kata.primefactors;

import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int i) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        int primeCandidate = 2;
        while (i > 1) {
            while (i % primeCandidate == 0) {
                primeFactors.add(primeCandidate);
                i /= primeCandidate;
            }
            primeCandidate++;
        }

        return primeFactors;
    }

}
