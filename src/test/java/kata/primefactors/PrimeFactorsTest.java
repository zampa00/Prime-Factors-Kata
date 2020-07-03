package kata.primefactors;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        ArrayList<Integer> expectedPrimes = new ArrayList<Integer>();
        Assert.assertEquals("List should be empty", expectedPrimes, PrimeFactors.generate(1));
    }

}
