package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsFollowedByStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void validBracketingWithinStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsSurroundStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void beginningBracketWithoutClosingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void justOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void justBracketsThatAreOutOfOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void noClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void noOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("LaunchCode]")));
    }

    @Test
    public void closingBracketProceedingOpeningReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }

    @Test
    public void multipleLevelsOfBracketsReturnsTrue() {
        assertTrue(
                BalancedBrackets.hasBalancedBrackets("Hello[World[LaunchCode]]"));
    }

    @Test
    public void textEnclosedInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

}
