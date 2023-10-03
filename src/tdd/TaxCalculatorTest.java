package tdd;

import Chapter4.TaxCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {


    @Test
    public void testThatTaxCalculatorExist(){
        TaxCalculator taxCalculator = new TaxCalculator();
        assertNotNull(taxCalculator);
    }

    @Test
    public void testThatCitizensHaveName(){
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setName("Joy");
        assertEquals("Joy", taxCalculator.getName());
    }

    @Test
    public void testThatCitizensHasEarnings(){
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setEarnings(30_000);
        assertEquals(30_000, taxCalculator.getEarnings());
    }

    @Test
    public void testCalculateTaxRate(){
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setTaxRate(30_000);
        assertEquals(4500, taxCalculator.getTaxRate());
        taxCalculator.setTaxRate(47_000);
        assertEquals(9400, taxCalculator.getEarnings());
    }

}