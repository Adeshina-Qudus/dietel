package tdd;

import Chapter4.SalesCommissionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionCalculatorTest {


    @Test
    public void testThatSalesCommissionCalculatorExist() {
        SalesCommissionCalculator salesCommission = new SalesCommissionCalculator();
        assertNotNull(salesCommission);
    }

    @Test
    public void testThatSalesPeopleReceive200PerWeek() {
        SalesCommissionCalculator salesCommission = new SalesCommissionCalculator();
        salesCommission.setEarningPerWeek(200);
        assertEquals(200,salesCommission.getEarningPerWeek());
    }

    @Test
    public void testMerchandiseSoldInAWeek(){
        SalesCommissionCalculator salesCommission = new SalesCommissionCalculator();
        salesCommission.setMerchandiseSold(239.99);
        salesCommission.setMerchandiseSold(129.75);
        salesCommission.setMerchandiseSold(99.95);
        salesCommission.setMerchandiseSold(350.89);
        assertEquals(820.58, salesCommission.getMerchandiseSold());
    }

    @Test
    public void testThatSalesPersonReceive9percentOfMerchandiseSold() {
        SalesCommissionCalculator salesCommission = new SalesCommissionCalculator();
        salesCommission.setPercent(9);
        salesCommission.setMerchandiseSold(820.58);
        assertEquals(73.8522, salesCommission.getMerchandiseSoldProfit());
    }

    @Test
    public void testSalesPersonTotalEarningsPerWeek(){
        SalesCommissionCalculator salesCommission = new SalesCommissionCalculator();
        salesCommission.setEarningPerWeek(200);
        salesCommission.setMerchandiseSoldProfit(73.8522);
        assertEquals(273.8522, salesCommission.getTotalEarnings());
    }

}