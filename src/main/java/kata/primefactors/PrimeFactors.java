package kata.primefactors;

import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int i) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        if (i % 2 == 0) {
            primeFactors.add(i);
        }
        if (i % 3 == 0) {
            primeFactors.add(i);
        }

        return primeFactors;
    }

}
