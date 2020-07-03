package kata.primefactors;

import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int i) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        for (int primeCandidate = 2; primeCandidate <= i; primeCandidate++) {
            while (i % primeCandidate == 0) {
                primeFactors.add(primeCandidate);
                i /= primeCandidate;
            }
        }

        return primeFactors;
    }

}
